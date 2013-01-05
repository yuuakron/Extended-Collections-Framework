package yuu.akron.experimental;

import yuu.akron.ucollection.*;
import yuu.akron.ucollection.interfaces.*;
import yuu.akron.ucollection.another.*;
import yuu.akron.ucollection.interfaces.another.*;


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
        List<String> list = new ArrayList<String>("a", "b");
        List<String> list2 = new UArrayList<String>("c", "d");
        
        System.out.println(""+list + list2);
    }
}
