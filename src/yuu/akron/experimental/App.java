package yuu.akron.experimental;

import java.util.Arrays;
import yuu.akron.ucollection.another.*;
import yuu.akron.ucollection.interfaces.another.*;
import yuu.akron.ucollection.*;
import yuu.akron.ucollection.interfaces.*;

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
    }
}
