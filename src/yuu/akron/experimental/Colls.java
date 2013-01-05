package yuu.akron.experimental;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets.SetView;
import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import yuu.akron.ucollection.interfaces.*;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author yuuakron
 */
public class Colls<E, K, V> implements Collection<E>, List<E>, Set<E>, SortedSet<E>, NavigableSet<E>, Queue<E>, Deque<E>,
                                       CollectionWithUtility<E>, ListWithUtility<E>, SetWithUtility<E>, SortedSetWithUtility<E>, NavigableSetWithUtility<E>, QueueWithUtility<E>, DequeWithUtility<E> {
    //listの場合 Eは要素の型
    //mapの場合 EはKeyの型、Vは値の型

    private enum Interfaces {

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

    private enum Contents {

        Normal,
        Enum,
        Empty
    }
    private Object collection;
    private boolean duplication;
    private boolean sorted;
    private boolean navigable;
    private boolean identity;
    private boolean weak;
    private Interfaces interfaces;
    private Contents contents;

    public static class Builder<E, K, V> {

        private Object collection;
        private boolean duplication = true;
        private boolean sorted = false;
        private boolean navigable = false;
        private boolean identity = false;
        private boolean weak = false;
        private Interfaces interfaces = Interfaces.List;
        private Contents contents = Contents.Normal;

        public Builder() {
        }

        public Builder<E, K, V> set() {
            duplication = false;
            return this;
        }

        public Builder<E, K, V> sort() {
            sorted = true;
            return this;
        }

        public Builder<E, K, V> navigable() {
            navigable = true;
            return this;
        }

        public Builder<E, K, V> deque() {
            interfaces = Interfaces.Deque;
            return this;
        }

        public Builder<E, K, V> queue() {
            interfaces = Interfaces.Queue;
            return this;
        }

        public Colls<E, K, V> build() {
            switch (interfaces) {
                case List:
                    if (duplication) {
                        collection = new ArrayList<E>();
                    } else {
                        collection = new HashSet<E>();
                    }
                    break;
                case Map:
                    break;
                case Queue:
                    break;
                case Deque:
                    break;
            }

            return new Colls<E, K, V>(this);
        }
    }

    private Colls() {
    }

    public static <E, K, V> Colls<E, K, V> newColls() {
        return new Colls.Builder<E, K, V>().build();
    }

    /*
     * public collection(Class<?> clazz) throws InstantiationException,
     * IllegalAccessException { collection = clazz.newInstance(); }
     */
    @SuppressWarnings("AccessingNonPublicFieldOfAnotherObject")
    private Colls(Builder<E, K, V> builder) {
        this.collection = builder.collection;

        this.duplication = builder.duplication;
        this.sorted = builder.sorted;
        this.navigable = builder.navigable;
        this.interfaces = builder.interfaces;
        this.contents = builder.contents;
    }

    //Collection, Set
    public boolean add(E e) {
        try {
            Method method = collection.getClass().getMethod("add", Object.class);
            return (Boolean) method.invoke(collection, e);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addAll(Collection<? extends E> c) {
        try {
            Method method = collection.getClass().getMethod("addAll", Colls.class);
            return (Boolean) method.invoke(collection, c);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void clear() {
        try {
            Method method = collection.getClass().getMethod("clear", null);
            method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean contains(Object o) {
        try {
            Method method = collection.getClass().getMethod("contains", Object.class);
            return (Boolean) method.invoke(collection, o);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean containsAll(Collection<?> c) {
        try {
            Method method = collection.getClass().getMethod("containsAll", Colls.class);
            return (Boolean) method.invoke(collection, c);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isEmpty() {
        try {
            Method method = collection.getClass().getMethod("isEmpty", null);
            return (Boolean) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterator<E> iterator() {
        try {
            Method method = collection.getClass().getMethod("iterator", null);
            return (Iterator<E>) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean remove(Object o) {
        try {
            Method method = collection.getClass().getMethod("remove", Object.class);
            return (Boolean) method.invoke(collection, o);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean removeAll(Collection<?> c) {
        try {
            Method method = collection.getClass().getMethod("removeAll", Colls.class);
            return (Boolean) method.invoke(collection, c);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean retainAll(Collection<?> c) {
        try {
            Method method = collection.getClass().getMethod("retainAll", Colls.class);
            return (Boolean) method.invoke(collection, c);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int size() {
        try {
            Method method = collection.getClass().getMethod("size", null);
            return (Integer) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object[] toArray() {
        try {
            Method method = collection.getClass().getMethod("toArray", null);
            return (Object[]) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public <T> T[] toArray(T[] a) {
        try {
            Method method = collection.getClass().getMethod("toArray", Object[].class);
            return (T[]) method.invoke(collection, a);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //List
    public void add(int index, E element) {
        try {
            Method method = collection.getClass().getMethod("add", int.class, Object.class);
            method.invoke(collection, index, element);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        try {
            Method method = collection.getClass().getMethod("addAll", int.class, Colls.class);
            return (Boolean) method.invoke(collection, index, c);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E get(int index) {
        try {
            Method method = collection.getClass().getMethod("get", int.class);
            return (E) method.invoke(collection, index);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int indexOf(Object o) {
        try {
            Method method = collection.getClass().getMethod("indexOf", Object.class);
            return (Integer) method.invoke(collection, o);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int lastIndexOf(Object o) {
        try {
            Method method = collection.getClass().getMethod("lastIndexOf", Object.class);
            return (Integer) method.invoke(collection, o);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ListIterator<E> listIterator() {
        try {
            Method method = collection.getClass().getMethod("listIterator", null);
            return (ListIterator<E>) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ListIterator<E> listIterator(int index) {
        try {
            Method method = collection.getClass().getMethod("listIterator", int.class);
            return (ListIterator<E>) method.invoke(collection, index);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E remove(int index) {
        try {
            Method method = collection.getClass().getMethod("remove", int.class);
            return (E) method.invoke(collection, index);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E set(int index, E element) {
        try {
            Method method = collection.getClass().getMethod("set", int.class, Object.class);
            return (E) method.invoke(collection, index, element);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<E> subList(int fromIndex, int toIndex) {
        try {
            Method method = collection.getClass().getMethod("subList", int.class, int.class);
            return (List<E>) method.invoke(collection, fromIndex, toIndex);
        } catch (Exception ex) {
            Logger.getLogger(Colls.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //SortedSet関連
    public Comparator<? super E> comparator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E first() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E last() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public SortedSet<E> headSet(E toElement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public SortedSet<E> subSet(E fromElement, E toElement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public SortedSet<E> tailSet(E fromElement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //NavigableSet関連
    public E ceiling(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterator<E> descendingIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableSet<E> descendingSet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E floor(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E higher(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E lower(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E pollFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E pollLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Qeque関連 
    public E element() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean offer(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E poll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Deque関連
    public void addFirst(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addLast(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean offerFirst(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean offerLast(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E peekFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E peekLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void push(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean removeFirstOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean removeLastOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Collections
    //for Collection<>
    public boolean addAll(E... elements) {
        return Collections.addAll((Collection<? super E>) collection, elements);
    }

    public Collection<E> checkedCollection(Class<E> type) {
        return Collections.checkedCollection((Collection<E>) collection, type);
    }

    public boolean disjoint(Collection<?> c) {
        return Collections.disjoint((Collection<E>) collection, c);
    }

    public Enumeration<E> enumeration() {
        return Collections.enumeration((Collection<E>) collection);
    }

    public int frequency(Object o) {
        return Collections.frequency((Collection<E>) collection, o);
    }

    public <E extends Comparable<? super E>> E max() {
        return Collections.max((Collection<E>) collection);
    }

    public E max(Comparator<? super E> comp) {
        return Collections.max((Collection<E>) collection, comp);
    }

    public <E extends Comparable<? super E>> E min() {
        return Collections.min((Collection<E>) collection);
    }

    public E min(Comparator<? super E> comp) {
        return Collections.min((Collection<E>) collection, comp);
    }

    public Collection<E> synchronizedCollection() {
        return Collections.synchronizedCollection((Collection<E>) collection);
    }

    public Collection<E> unmodifiableCollection() {
        return Collections.unmodifiableCollection((Collection<E>) collection);
    }

    //for Set<>
    public Set<E> checkedSet(Class<E> type) {
        return Collections.checkedSet((Set<E>) collection, type);
    }

    public Set<E> unmodifiableSet() {
        return Collections.unmodifiableSet((Set<E>) collection);
    }

    public Set<E> synchronizedSet() {
        return Collections.synchronizedSet((Set<E>) collection);
    }

    //for SortedSet<>
    public SortedSet<E> checkedSortedSet(Class<E> type) {
        return Collections.checkedSortedSet((SortedSet<E>) collection, type);
    }

    public SortedSet<E> unmodifiableSortedSet() {
        return Collections.unmodifiableSortedSet((SortedSet<E>) collection);
    }

    public SortedSet<E> synchronizedSortedSet() {
        return Collections.synchronizedSortedSet((SortedSet<E>) collection);
    }

    //for NavigableSet<>
    //nothing
    //for List<>
    public <E extends Comparable<? super E>> int binarySearch(E key) {
        return Collections.binarySearch((List<E>) collection, key);
    }

    public int binarySearch(E key, Comparator<? super E> c) {
        return Collections.binarySearch((List<E>) collection, key, c);
    }

    public List<E> checkedList(Class<E> type) {
        return Collections.checkedList((List<E>) collection, type);
    }

    public void copy(List<? super E> dest) {
        Collections.copy(dest, (List<E>) collection);
    }

    public void fill(E obj) {
        Collections.fill((List<E>) collection, obj);
    }

    public int indexOfSubList(List<?> target) {
        return Collections.indexOfSubList((List<E>) collection, target);
    }

    public int lastIndexOfSubList(List<?> target) {
        return Collections.lastIndexOfSubList((List<E>) collection, target);
    }

    public boolean replaceAll(E oldVal, E newVal) {
        return Collections.replaceAll((List<E>) collection, oldVal, newVal);
    }

    public void reverse() {
        Collections.reverse((List<E>) collection);
    }

    public void rotate(int distance) {
        Collections.rotate((List<E>) collection, distance);
    }

    public void shuffle() {
        Collections.shuffle((List<E>) collection);
    }

    public void shuffle(Random rnd) {
        Collections.shuffle((List<E>) collection, rnd);
    }

    public <E extends Comparable<? super E>> void sort() {
        Collections.sort((List<E>) collection);
    }

    public void sort(Comparator<? super E> c) {
        Collections.sort((List<E>) collection, c);
    }

    public void swap(int i, int j) {
        Collections.swap((List<E>) collection, i, j);
    }

    public void checked(Class<E> type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void synchronize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void unmodifiable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public List<E> synchronizedList() {
        return Collections.synchronizedList((List<E>) collection);
    }

    public List<E> unmodifiableList() {
        return Collections.unmodifiableList((List<E>) collection);
    }

    //for Map<>
    public Map<K, V> checkedMap(Class<K> keyEype, Class<V> valueEype) {
        return Collections.checkedMap((Map<K, V>) collection, keyEype, valueEype);
    }

    public Map<K, V> synchronizedMap() {
        return Collections.synchronizedMap((Map<K, V>) collection);
    }

    public Map<K, V> unmodifiableMap() {
        return Collections.unmodifiableMap((Map<K, V>) collection);
    }

    //for SortedMap<>
    public SortedMap<K, V> checkedSortedMap(Class<K> keyEype, Class<V> valueEype) {
        return Collections.checkedSortedMap((SortedMap<K, V>) collection, keyEype, valueEype);
    }

    public SortedMap<K, V> unmodifiableSortedMap() {
        return Collections.unmodifiableSortedMap((SortedMap<K, V>) collection);
    }

    public SortedMap<K, V> synchronizedSortedMap() {
        return Collections.synchronizedSortedMap((SortedMap<K, V>) collection);
    }

    //for NavigableMap<>
    //nothing
    //for Queue<>
    //nothing
    //for Deque<>
    @Override
    public yuu.akron.ucollection.interfaces.another.Queue<E> asLifoQueue() {
        return new yuu.akron.ucollection.another.ArrayDeque<E>(Collections.asLifoQueue((Deque<E>) collection));
    }

    @Override
    public boolean all(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean any(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E find(Predicate<? super E> predicate, E defaultValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E find(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int indexOf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Iterable<? extends E> elementsToAdd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Iterator<? extends E> iterator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Collection<E> filter(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.Collection<T> transform(Function<? super E, T> function) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SetView<E> difference(Set<?> set2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SetView<E> intersection(Set<?> set2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SetView<E> symmetricDifference(Set<? extends E> set2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SetView<E> union(Set<? extends E> set2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //static function
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

    //変換関数
    public Collection<E> toCollection() {
        if (collection instanceof Collection) {
            return (Collection<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<E> toList() {
        if (collection instanceof List) {
            return (List<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set<E> toSet() {
        if (collection instanceof Set) {
            return (Set<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public SortedSet<E> toSortedSet() {
        if (collection instanceof SortedSet) {
            return (SortedSet<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableSet<E> toNavigableSet() {
        if (collection instanceof NavigableSet) {
            return (NavigableSet<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Queue<E> toQueue() {
        if (collection instanceof Queue) {
            return (Queue<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Deque<E> toDeque() {
        if (collection instanceof Deque) {
            return (Deque<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Map<K, V> toMap() {
        if (collection instanceof Map) {
            return (Map<K, V>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public SortedMap<K, V> toSortedMap() {
        if (collection instanceof SortedMap) {
            return (SortedMap<K, V>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableMap<K, V> toNavigableMap() {
        if (collection instanceof NavigableMap) {
            return (NavigableMap<K, V>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //検査関数
    public boolean is(Class<?> clazz) {
        return clazz.isAssignableFrom(collection.getClass());
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
         * final collection<E> other = (collection<E>) obj; if (this.collection
         * != other.collection && (this.collection == null ||
         * !this.collection.equals(other.collection))) { return false; } return
         * true;
         */
        return EqualsBuilder.reflectionEquals(obj, this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
