package yuu.akron.experimental;

//import yuu.akron.ucollection.another.*;
//import yuu.akron.ucollection.interfaces.another.*;
import com.google.common.collect.Lists;
import yuu.akron.ucollection.*;
import yuu.akron.ucollection.interfaces.*;
import java.util.*;

/**
 * 実験のためのクラス
 *
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class App {

    /**
     * いろいろ試すメイン関数
     */
    public static void main(String[] args) {
        //従来
        List<String> list = new ArrayList<String>(Arrays.asList("a", "b"));
        List<String> list2 = Arrays.asList("a", "b");
        //拡張
        UList<String> slist = new UArrayList<String>("a", "b");
        UList<String> slist2 = UArrayList.newList("a", "b");
    }
}
