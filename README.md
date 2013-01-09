Extended Collections Framework
-------------------------------------
-------------------------------------

Java Collections Frameworkを拡張したフレームワークを目指している。
主に以下の3つのコレクションを目指している。

1. Java Collections Frameworkにメソッドを追加したコレクション：collections with utilities(ucollection)
2. 関数型のようなコレクション：functional collections(fcollection)
3. 動的に内部動作を最適化するコレクション：dynamic collections(dcollection)

個人で使うために設計、実装しているためJavaの流儀や考え方には反している部分もある。
Objective-C, Scala, Xtend, haskellなどの影響を受けている。
いるかどうかはわからないが複数人で利用する場合は劇薬になる場合があるかもしれないので要注意。
またJavaにてインターフェースを拡張する場合のコンセプトコードでもある。

ucollectionの実装はほぼ完成(現状ではjava.util以下のクラスのみ)。ただし、テストとテストコード, JavaDocが未完成。
他はまだまだ実験段階。

利用方法
-------
NetBeansプロジェクト形式で配布されるのでNetBeansでビルドしてください。
またはNetBenasのプロジェクト形式なのでantでもビルド可能。

ライセンス
--------
修正BSDライセンス。

ucollectionについて
-----------------

### ucollectionの設計目標

1. 各インターフェースを拡張し、より多くのメソッドを呼べるようにする。
2. 各インターフェース、各実装クラスはJava Collections Frameworkと互換性を持たせる。
3. 各インターフェース、各実装クラスはJava Collections Frameworkと共存可能。
4. 各インターフェース、各実装クラスはJava Collections Frameworkの対応クラスと容易に入れ替え可能
5. 短い名前を用意する。

現状の実装ではjava.util.Collectionsなどのユーティリティクラスを統合している。
guavaに依存。

### ucollectionの使い方
Java Collections Frameworkと共存性を持たせるためにパッケージが4つに分かれている。
それぞれのパッケージは以下。

1. yuu.akron.ucollection：拡張実装クラスと短縮名クラス群
2. yuu.akron.ucollection.another：java.util下のクラスと同名のクラス群
3. yuu.akron.ucollection.interfaces：拡張インターフェースと短縮インターフェース群
4. yuu.akron.ucollection.interfaces.another：java.util下のインターフェースと同名のインターフェース群

共存させたい場合は.anotherで終わらないパッケージを、置き換えたい場合は.anotherで終わるパッケージをインポートする。
これはクラス名を同名にすることにより実現している（パッケージは異なる）。

例：共存する場合

```java
    import java.util.*;
    import yuu.akron.ucollection.*;
    import yuu.akron.ucollection.interfaces.*;

    List<String> javaList = new ArrayList<String>();                            //java.util.ArrayList
    ListWithUtility<String> extendedList = new ArrayListWithUtility<String>();  //拡張実装クラス
    UList<String> shortNameList = new UArrayList<String>();                     //短縮名クラス
```

例：入れ替える場合

```java
    import yuu.akron.ucollection.another.*;
    import yuu.akron.ucollection.interfaces.another.*;

    List<Stinrg> alternativeList = new ArrayList<String>();                 //同名クラス（中身は拡張実装クラス）
    java.util.List<String> javaList = new java.util.ArrayList<String>();    //完全修飾名なら共存可能
```

拡張インターフェースはjava.util以下のインターフェースを継承しているため拡張実装クラスはjava.utilのインターフェース型の変数にも代入可能。

```java
    import java.util.*;
    import yuu.akron.ucollection.*;

    List<String> javaList = new ArrayListWithUtility<String>();
```

拡張実装クラスはjava.util下のクラスを継承している（EnumSet以外）ためjava.utilの実装クラス型の変数にも代入可能

```java
    import java.util.*;
    import yuu.akron.ucollection.*;

    ArrayList<String> javaList = new ArrayListWithUtility<String>();
```

拡張実装クラス、短縮名クラス、同名クラスは継承関係になっている。
java.utilクラス=>拡張実装クラス=>短縮名クラス=>同名クラス
左が親、右が子の関係である。
このような関係のため次のような結果になる。

```java
    java.util.ArrayList<String> javaList;       //java.util.ArrayList
    ArrayListWithUtility<String> extendedList;  //拡張
    UArrayList<String> shortNameList;           //短縮名
    ArrayList<String> alternativeList;          //同名

    javaList = new java.util.ArrayList<String>();
    javaList = new ArrayListWithUtility<String>();
    javaList = new UArrayList<String>();
    javaList = new ArrayList<String>();
    extendedList = new java.util.ArrayList<String>();       //error
    extendedList = new ArrayListWithUtility<String>();
    extendedList = new UArrayList<String>();
    extendedList = new ArrayList<String>();
    shortNameList = new java.util.ArrayList<String>();      //error
    shortNameList = new ArrayListWithUtility<String>();     //error
    shortNameList = new UArrayList<String>();
    shortNameList = new ArrayList<String>();
    alternativeList = new java.util.ArrayList<String>();    //error
    alternativeList = new ArrayListWithUtility<String>();   //error
    alternativeList = new UArrayList<String>();             //error
    alternativeList = new ArrayList<String>();
```

ただし、3つのクラスは4つのインターフェース（java.util、拡張、短縮、同名）をすべて実装しているためにインターフェースを介した場合は同じように利用可能である。

```java
    java.util.List<String> javaList;        //java.util.List
    ListWithUtility<String> extendedList;   //拡張
    UList<String> shortNameList;            //短縮名
    List<String> alternativeList;           //同名

    javaList = new ArrayListWithUtility<String>();
    javaList = new UArrayList<String>();
    javaList = new ArrayList<String>();
    extendedList = new ArrayListWithUtility<String>();
    extendedList = new UArrayList<String>();
    extendedList = new ArrayList<String>();
    shortNameList = new ArrayListWithUtility<String>();
    shortNameList = new UArrayList<String>();
    shortNameList = new ArrayList<String>();
    alternativeList = new ArrayListWithUtility<String>();
    alternativeList = new UArrayList<String>();
    alternativeList = new ArrayList<String>();
```

3つのクラスは中身が同じならequalsメソッドでは等価になるように設計されている。
また、現状ではjava.utilのクラスとの比較ではequals規約違反になっている。いずれ改善の予定。

```java
    java.util.List<String> javaList = new java.util.ArrayList<String>(Arrays.asList("a"));
    ListWithUtility<String> extendedList = new ArrayListWithUtility<String>("a");
    UList<String> shortNameList = new UArrayList<String>("a");
    List<String> alternativeList = new ArrayList<String>("a");

    System.out.println(extendedList.equals(extendedList));      //true
    System.out.println(extendedList.equals(shortNameList));     //true
    System.out.println(extendedList.equals(alternativeList));   //true
    System.out.println(shortNameList.equals(extendedList));     //true
    System.out.println(shortNameList.equals(shortNameList));    //true
    System.out.println(shortNameList.equals(alternativeList));  //true
    System.out.println(alternativeList.equals(extendedList));   //true
    System.out.println(alternativeList.equals(shortNameList));  //true

    System.out.println(javaList.equals(extendedList));          //true
    System.out.println(javaList.equals(shortNameList));         //true
    System.out.println(javaList.equals(alternativeList));       //true    
    System.out.println(extendedList.equals(javaList));          //false
    System.out.println(shortNameList.equals(javaList));         //false
    System.out.println(alternativeList.equals(javaList));       //false
```

スタティックファクトリーメソッドなどが追加されている。

```java
    //従来の書き方
    List<String> javaList = new ArrayList<String>(Arrays.asList("a", "b"));
    List<String> javaList2 = Arrays.asList("a", "b");
    //拡張フレームワークで可能になった書き方（従来の書き方も可能）
    UList<String> shortNameList = new UArrayList<String>("a", "b");
    UList<String> shortNameList2 = UArrayList.newList("a", "b");
```