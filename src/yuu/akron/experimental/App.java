package yuu.akron.experimental;

import yuu.akron.ulang.S;


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
        S str = new S("a");
        S a = str.toAnotherString();
        str = new S("b");
        
        str.p();
        a.p();
    }
}
