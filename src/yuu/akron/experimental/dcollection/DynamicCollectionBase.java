package yuu.akron.experimental.dcollection;

import java.util.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 *
 * @author yuuakron
 */
public abstract class DynamicCollectionBase {

    protected enum Interfaces {

        List,
        Set,
        SortedList,
        NavigableSet,
        Map,
        SortedMap,
        NavigabelMap,
        Queue,
        Deque
    }

    protected enum Contents {

        Normal,
        Enum,
        Empty
    }
    protected Object collection;
    protected Interfaces interfaces;
    protected Contents contents;

    //type check function
    public boolean is(Class<?> clazz) {
        return clazz.isAssignableFrom(collection.getClass());
    }

    //Utility from java.util.Collections
    public static <T> List<T> emptyList() {
        return Collections.emptyList();
    }

    public static <K, V> Map<K, V> emptyMap() {
        return Collections.emptyMap();
    }

    public static <T> Set<T> emptySet() {
        return Collections.emptySet();
    }

    public static <T> ArrayList<T> list(Enumeration<T> e) {
        return Collections.list(e);
    }

    public static <T> List<T> nCopies(int n, T o) {
        return Collections.nCopies(n, o);
    }

    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <T> Comparator<T> reverseOrder() {
        return Collections.reverseOrder();
    }

    public static <T> Comparator<T> reverseOrder(Comparator<T> cmp) {
        return Collections.reverseOrder(cmp);
    }

    public static <T> Set<T> singleton(T o) {
        return Collections.singleton(o);
    }

    public static <T> List<T> singletonList(T o) {
        return Collections.singletonList(o);
    }

    public static <K, V> Map<K, V> singletonMap(K key, V value) {
        return Collections.singletonMap(key, value);
    }
    
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        /*
         * final Colls<E> other = (Colls<E>) obj; if (this.colls != other.colls
         * && (this.colls == null || !this.colls.equals(other.colls))) { return
         * false; } return true;
         */
        return EqualsBuilder.reflectionEquals(obj, this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
