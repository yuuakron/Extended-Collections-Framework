package yuu.akron.ucollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import java.util.*;

/**
 *  java.util.Collections
 *  com.google.common.collect.Collections2
 * 
 * @author yuu@akron
 *
 *
 */
public class UCollections{

    public static <T> boolean addAll(Collection<? super T> c, T... elements) {
        return Collections.addAll(c, elements);
    }

    public static <T> yuu.akron.ucollection.interfaces.another.Queue<T> asLifoQueue(Deque<T> deque) {
        return new LinkedListWithUtility<T>(Collections.asLifoQueue(deque));
    }

    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return Collections.binarySearch(list, key);
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return Collections.binarySearch(list, key, c);
    }
/*
    public static <E> yuu.akron.ucollection.interfaces.another.Collection<E> checkedCollection(Collection<E> c, Class<E> type) {
        return new ArrayListWithUtility<E>(c).checked(type);
    }

    public static <E> yuu.akron.ucollection.interfaces.another.List<E> checkedList(List<E> list, Class<E> type) {
        return new ArrayListWithUtility<E>(list).checked(type);
    }

    public static <K, V> yuu.akron.ucollection.interfaces.another.Map<K, V> checkedMap(Map<K, V> m, Class<K> keyType, Class<V> valueType) {
        return new HashMapWithUtility<K, V>(m).checked(keyType, valueType);
    }

    public static <E> yuu.akron.ucollection.interfaces.another.Set<E> checkedSet(Set<E> s, Class<E> type) {
        return new HashSetWithUtility<E>(s).checked(type);
    }

    public static <K, V> yuu.akron.ucollection.interfaces.another.SortedMap<K, V> checkedSortedMap(SortedMap<K, V> m, Class<K> keyType, Class<V> valueType) {
        return new TreeMapWithUtility<K, V>(m).checked(keyType, valueType);
    }

    public static <E> yuu.akron.ucollection.interfaces.another.SortedSet<E> checkedSortedSet(SortedSet<E> s, Class<E> type) {
        return new TreeSetWithUtility<E>(s).checked(type);
    }
*/
    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        Collections.copy(dest, src);
    }

    public static boolean disjoint(Collection<?> c1, Collection<?> c2) {
        return Collections.disjoint(c1, c2);
    }
/*
    public static <T> yuu.akron.ucollection.interfaces.another.List<T> emptyList() {
        return new ArrayListWithUtility<T>().empty();
    }

    public static <K, V> yuu.akron.ucollection.interfaces.another.Map<K, V> emptyMap() {
        return new HashMapWithUtility<K, V>().empty();
    }

    public static <T> yuu.akron.ucollection.interfaces.another.Set<T> emptySet() {
        return new HashSetWithUtility<T>().empty();
    }
*/
    public static <T> Enumeration<T> enumeration(Collection<T> c) {
        return Collections.enumeration(c);
    }

    public static <T> void fill(List<? super T> list, T obj) {
        Collections.fill(list, obj);
    }

    public static int frequency(Collection<?> c, Object o) {
        return Collections.frequency(c, o);
    }

    public static int indexOfSubList(List<?> source, List<?> target) {
        return Collections.indexOfSubList(source, target);
    }

    public static int lastIndexOfSubList(List<?> source, List<?> target) {
        return Collections.lastIndexOfSubList(source, target);
    }

    public static <T> yuu.akron.ucollection.another.ArrayList<T> list(Enumeration<T> e) {
        return new yuu.akron.ucollection.another.ArrayList<T>(Collections.list(e));
    }

    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) {
        return Collections.max(coll);
    }

    public static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp) {
        return Collections.max(coll, comp);
    }

    public static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll) {
        return Collections.min(coll);
    }

    public static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp) {
        return Collections.min(coll, comp);
    }

    public static <T> yuu.akron.ucollection.interfaces.another.List<T> nCopies(int n, T o) {
        return new yuu.akron.ucollection.another.ArrayList<T>(Collections.nCopies(n, o));
    }

    public static <E> yuu.akron.ucollection.interfaces.another.Set<E> newSetFromMap(Map<E, Boolean> map) {
        return new yuu.akron.ucollection.another.HashSet<E>(Collections.newSetFromMap(map));
    }

    public static <T> boolean replaceAll(List<T> list, T oldVal, T newVal) {
        return Collections.replaceAll(list, oldVal, newVal);
    }

    public static void reverse(List<?> list) {
        Collections.reverse(list);
    }

    public static <T> Comparator<T> reverseOrder() {
        return Collections.reverseOrder();
    }

    public static <T> Comparator<T> reverseOrder(Comparator<T> cmp) {
        return Collections.reverseOrder(cmp);
    }

    public static void rotate(List<?> list, int distance) {
        Collections.rotate(list, distance);
    }

    public static void shuffle(List<?> list) {
        Collections.shuffle(list);
    }

    public static void shuffle(List<?> list, Random rnd) {
        Collections.shuffle(list, rnd);
    }

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    public static <T> void sort(List<T> list, Comparator<? super T> c) {
        Collections.sort(list, c);
    }

    public static void swap(List<?> list, int i, int j) {
        Collections.swap(list, i, j);
    }
/*
    public static <T> yuu.akron.ucollection.interfaces.another.Set<T> singleton(T o) {
        return new HashSetWithUtility<T>().singleton(o);
    }

    public static <T> yuu.akron.ucollection.interfaces.another.List<T> singletonList(T o) {
        return new ArrayListWithUtility<T>().singleton(o);
    }

    public static <K, V> yuu.akron.ucollection.interfaces.another.Map<K, V> singletonMap(K key, V value) {
        return new HashMapWithUtility<K, V>().singleton(key, value);
    }

    public static <T> yuu.akron.ucollection.interfaces.another.Collection<T> synchronizedCollection(Collection<T> c) {
        return new yuu.akron.ucollection.another.ArrayList<T>(c).synchronize();
    }

    public static <T> yuu.akron.ucollection.interfaces.another.List<T> synchronizedList(List<T> list) {
        return new yuu.akron.ucollection.another.ArrayList<T>(list).synchronize();
    }

    public static <K, V> yuu.akron.ucollection.interfaces.another.Map<K, V> synchronizedMap(Map<K, V> m) {
        return new yuu.akron.ucollection.another.HashMap<K, V>(m).synchronize();
    }

    public static <T> yuu.akron.ucollection.interfaces.another.Set<T> synchronizedSet(Set<T> s) {
        return new yuu.akron.ucollection.another.HashSet<T>(s).synchronize();
    }

    public static <K, V> yuu.akron.ucollection.interfaces.another.SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> m) {
        return new yuu.akron.ucollection.another.TreeMap<K, V>(m).synchronize();
    }

    public static <T> yuu.akron.ucollection.interfaces.another.SortedSet<T> synchronizedSortedSet(SortedSet<T> s) {
        return new yuu.akron.ucollection.another.TreeSet<T>(s).synchronize();
    }

    public static <T> yuu.akron.ucollection.interfaces.another.Collection<T> unmodifiableCollection(Collection<? extends T> c) {
        return new yuu.akron.ucollection.another.ArrayList<T>(c).unmodifiable();
    }

    public static <T> yuu.akron.ucollection.interfaces.another.List<T> unmodifiableList(List<? extends T> list) {
        return new yuu.akron.ucollection.another.ArrayList<T>(list).unmodifiable();
    }

    public static <K, V> yuu.akron.ucollection.interfaces.another.Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m) {
        return new yuu.akron.ucollection.another.HashMap<K, V>(m).unmodifiable();
    }

    public static <T> yuu.akron.ucollection.interfaces.another.Set<T> unmodifiableSet(Set<? extends T> s) {
        return new yuu.akron.ucollection.another.HashSet<T>(s).unmodifiable();
    }

    public static <K, V> yuu.akron.ucollection.interfaces.another.SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> m) {
        return new yuu.akron.ucollection.another.TreeMap<K, V>(m).unmodifiable();
    }

    public static <T> yuu.akron.ucollection.interfaces.another.SortedSet<T> unmodifiableSortedSet(SortedSet<T> s) {
        return new yuu.akron.ucollection.another.TreeSet<T>(s).unmodifiable();
    }
*/
    public static <E> yuu.akron.ucollection.interfaces.another.Collection<E> filter(Collection<E> unfiltered, Predicate<? super E> predicate) {
        return new ArrayListWithUtility<E>(Collections2.filter(unfiltered, predicate));
    }

    public static <E extends Comparable<? super E>> yuu.akron.ucollection.interfaces.another.Collection<List<E>> orderedPermutations(Iterable<E> elements) {
        return new ArrayListWithUtility<List<E>>(Collections2.orderedPermutations(elements));
    }

    public static <E> yuu.akron.ucollection.interfaces.another.Collection<List<E>> orderedPermutations(Iterable<E> elements, Comparator<? super E> comparator) {
        return new ArrayListWithUtility<List<E>>(Collections2.orderedPermutations(elements, comparator));
    }

    public static <E> yuu.akron.ucollection.interfaces.another.Collection<List<E>> permutations(Collection<E> elements) {
        return new ArrayListWithUtility<List<E>>(Collections2.permutations(elements));
    }

    public static <F, T> yuu.akron.ucollection.interfaces.another.Collection<T> transform(Collection<F> fromCollection, Function<? super F, T> function) {
        return new ArrayListWithUtility<T>(Collections2.transform(fromCollection, function));
    }
}