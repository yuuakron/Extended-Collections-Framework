/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.ucollection;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author yuuakron
 */
public class TestUtility {

    public static boolean is(Object obj, Class<?> clazz) {
        return clazz.isAssignableFrom(obj.getClass());
    }

    public static String isToString(Object obj, Class<?> clazz) {
        return clazz.getName() + ":" + is(obj, clazz);
    }

    public static boolean checkClass(Object obj, Class<?>[] classlist) {
        for (int i = 0; i < classlist.length; i++) {
            if (!is(obj, classlist[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUArrayList(Object obj) {
        Class<?>[] list = {Iterable.class, Collection.class, List.class, ArrayList.class, ArrayListWithUtility.class, Serializable.class, RandomAccess.class, Cloneable.class};
        return checkClass(obj, list);
    }
    
    public static boolean isULinkedList(Object obj){
        Class<?>[] list = {Iterable.class, Collection.class, List.class, LinkedList.class, LinkedListWithUtility.class, Serializable.class, Cloneable.class};
        return checkClass(obj, list);
    }
}
