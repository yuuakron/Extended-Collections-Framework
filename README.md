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
NetBeansプロジェクト形式で配布されるのでNetBeansでビルドしてください。
またはNetBenasのプロジェクト形式なのでantでもビルド可能。

ライセンスはBSDライセンス。


ucollectionについて

ucollectionの設計目標は以下

1. 各インターフェースを拡張し、より多くのメソッドを呼べるようにする。
2. 各インターフェース、各実装クラスはJava Collections Frameworkと互換性を持たせる。
3. 各インターフェース、各実装クラスはJava Collections Frameworkと共存可能。
4. 各インターフェース、各実装クラスはJava Collections Frameworkの対応クラスと容易に入れ替え可能
5. 短い名前を用意する。

現状の実装ではjava.util.Collectionsなどのユーティリティクラスを統合している。

ucollectionの使い方
Java Collections Frameworkと共存性を持たせるためにパッケージが4つに分かれている。
それぞれのパッケージは以下。
1. yuu.akron.ucollection：拡張実装クラスと短縮名クラス群
2. yuu.akron.ucollection.another：java.util下のクラスと同名のクラス群
3. yuu.akron.ucollection.interfaces：拡張インターフェースと短縮インターフェース群
4. yuu.akron.ucollection.interfaces.another：java.util下のインターフェースと同名のインターフェース群

共存させたい場合は.anotherで終わるパッケージを、置き換えたい場合は.anotherで終わるパッケージをインポートする。
これはクラス名を同名にすることにより実現している（パッケージは異なる）。

例：共存する場合

    import java.util.*;
    import yuu.akron.ucollection.*;
    import yuu.akron.ucollection.interfaces.*;

    List<String> jlist = new ArrayList<String>();   //java.util.ArrayList
    ListWithUtility<String> elist = new ArrayListWithUtility<String>(); //拡張実装クラス
    UList<String> slist = new UArrayList<String>(); //短縮名

例：入れ替える場合

    import yuu.akron.ucollection.another.*;
    import yuu.akron.ucollection.interfaces.another.*;

    List<Stinrg> alist = new ArrayList<String>();   //中身は拡張実装クラス


拡張インターフェースはjava.util以下のインターフェースを継承しているため拡張実装クラスはjava.utilのインターフェース型の変数にも代入可能。

例：

    import java.util.*;
    import yuu.akron.ucollection.*;

    List<String> jlist = new ArrayListWithUtility<String>();

拡張実装クラスはjava.util下のクラスを継承している（EnumSet以外）ためjava.utilの実装クラス型の変数にも代入可能

例：

    import java.util.*;
    import yuu.akron.ucollection.*;

    ArrayList<String> jlist = new ArrayListWithUtility<String>();

拡張実装クラス、短縮名クラス、同名クラスは継承関係になっている。
java.utilクラス=>拡張実装クラス=>短縮名クラス=>同名クラス
左が親、右が子の関係である。
このような関係のため次のような結果になる。

例：

    ArrayListWithUtility<String> elist; //拡張
    UArrayList<String> slist; //短縮名
    ArrayList<String> alist;  //同名
    
    elist = new ArrayListWithUtility<String>();
    elist = new UArrayList<String>();
    elist = new ArrayList<String>();
    slist = new ArrayListWithUtility<String>();    //error
    slist = new UArrayList<String>();
    slist = new ArrayList<String>();
    alist = new ArrayListWithUtility<String>();    //error
    alist = new UArrayList<String>();              //error
    alist = new ArrayList<String>();

ただし、3つのクラスは3つのインターフェース（拡張、短縮、同名）をすべて実装しているためにインターフェースを介した場合は同じように利用可能である。

例：

    ListWithUtility<String> elist; //拡張
    UList<String> slist; //短縮名
    List<String> alist;  //同名

    elist = new ArrayListWithUtility<String>();
    elist = new UArrayList<String>();
    elist = new ArrayList<String>();
    slist = new ArrayListWithUtility<String>();
    slist = new UArrayList<String>();
    slist = new ArrayList<String>();
    alist = new ArrayListWithUtility<String>();
    alist = new UArrayList<String>();
    alist = new ArrayList<String>();

3つのクラスは中身が同じならequalsメソッドでは等価になるように設計されている。

例：

    ListWithUtility<String> elist = new ArrayListWithUtility<String>("a");
    UList<String> slist = new UArrayList<String>("a");
    List<String> alist = new ArrayList<String>("a");

    System.out.println(elist.equals(elist));    //true
    System.out.println(elist.equals(slist));    //true
    System.out.println(elist.equals(alist));    //true
    System.out.println(slist.equals(elist));    //true
    System.out.println(slist.equals(slist));    //true
    System.out.println(slist.equals(alist));    //true
    System.out.println(alist.equals(elist));    //true
    System.out.println(alist.equals(slist));    //true
    System.out.println(slist.equals(alist));    //true

現状ではjava.utilのクラスとの比較ではequals規約違反になっている。いずれ改善の予定。

例：

    ListWithUtility<String> elist = new ArrayListWithUtility<String>("a");
    UList<String> slist = new UArrayList<String>("a");
    List<String> jlist = new ArrayList<String>(Arrays.asList("a"));

    System.out.println(elist.equals(elist));    //true
    System.out.println(elist.equals(slist));    //true
    System.out.println(elist.equals(jlist));    //false
    System.out.println(slist.equals(elist));    //true
    System.out.println(slist.equals(slist));    //true
    System.out.println(slist.equals(jlist));    //false
    System.out.println(jlist.equals(elist));    //true
    System.out.println(jlist.equals(slist));    //true
    System.out.println(jlist.equals(jlist));    //true

スタティックファクトリーメソッドなどが追加されている。

例：

    //従来の書き方
    List<String> list = new ArrayList<String>(Arrays.asList("a", "b"));
    List<String> list2 = Arrays.asList("a", "b");
    //拡張フレームワークで可能になった書き方（従来の書き方も可能）
    UList<String> slist = new UArrayList<String>("a", "b");
    UList<String> slist2 = UArrayList.newList("a", "b");
