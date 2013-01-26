package yuu.akron.ucollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.rits.cloning.Cloner;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import yuu.akron.ulang.DeepClonable;
import yuu.akron.ulang.DeepCloneUtils;

/**
 * テスト
 *
 * @param <E>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class ArrayListWithUtility<E> extends ArrayList<E> implements yuu.akron.ucollection.interfaces.another.List<E> {

    /**
     * java.util.ArrayListを内部に持つように初期化。
     */
    public ArrayListWithUtility() {
        super();
    }

    /**
     * java.util.ArrayListを内部に持つように初期化。
     *
     * @param c
     */
    public ArrayListWithUtility(Collection<? extends E> c) {
        super(c);
    }

    /**
     * java.util.ArrayListを内部に持つように初期化。
     *
     * @param initialCapacity
     */
    public ArrayListWithUtility(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * java.util.ArrayListを内部に持つように初期化。
     * java.util.ArrayListはjava.util.Arrays.asList(elements)を引数として初期化される。
     *
     * @param elements
     */
    public ArrayListWithUtility(E... elements) {
        super(Arrays.asList(elements));
    }

    /**
     * スタティックファクトリーメソッド。
     *
     * @param <E>
     * @return
     */
    public static <E> yuu.akron.ucollection.another.ArrayList<E> newList() {
        return new yuu.akron.ucollection.another.ArrayList<E>();
    }

    /**
     * スタティックファクトリーメソッド。
     *
     * @param <E>
     * @param c
     * @return
     */
    public static <E> yuu.akron.ucollection.another.ArrayList<E> newList(Collection<? extends E> c) {
        return new yuu.akron.ucollection.another.ArrayList<E>(c);
    }

    /**
     * スタティックファクトリーメソッド。
     *
     * @param <E>
     * @param initialCapacity
     * @return
     */
    public static <E> yuu.akron.ucollection.another.ArrayList<E> newList(int initialCapacity) {
        return new yuu.akron.ucollection.another.ArrayList<E>(initialCapacity);
    }

    /**
     * スタティックファクトリーメソッド。
     *
     * @param <E>
     * @param elements
     * @return
     */
    public static <E> yuu.akron.ucollection.another.ArrayList<E> newList(E... elements) {
        return new yuu.akron.ucollection.another.ArrayList<E>(elements);
    }

    @Override
    public yuu.akron.ucollection.another.ArrayList<E> subList(int fromIndex, int toIndex) {
        return new yuu.akron.ucollection.another.ArrayList<E>(super.subList(fromIndex, toIndex));
    }

    @Override
    public yuu.akron.ucollection.another.ArrayList<E> clone() {
        return (yuu.akron.ucollection.another.ArrayList<E>) super.clone();
    }

    //Utility from java.util.Collections
    @Override
    public <E extends Comparable<? super E>> int binarySearch(E key) {
        return Collections.binarySearch((List<E>) this, key);
    }

    @Override
    public int binarySearch(E key, Comparator<? super E> c) {
        return Collections.binarySearch(this, key, c);
    }

    @Override
    public void copy(List<? super E> dest) {
        Collections.copy(dest, this);
    }

    @Override
    public void fill(E obj) {
        Collections.fill(this, obj);
    }

    @Override
    public int indexOfSubList(List<?> target) {
        return Collections.indexOfSubList(this, target);
    }

    @Override
    public int lastIndexOfSubList(List<?> target) {
        return Collections.lastIndexOfSubList(this, target);
    }

    @Override
    public boolean replaceAll(E oldVal, E newVal) {
        return Collections.replaceAll(this, oldVal, newVal);
    }

    @Override
    public void reverse() {
        Collections.reverse(this);
    }

    @Override
    public void rotate(int distance) {
        Collections.rotate(this, distance);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this);
    }

    @Override
    public void shuffle(Random rnd) {
        Collections.shuffle(this, rnd);
    }

    //list.<E>sort()
    @Override
    public <E extends Comparable<? super E>> void sort() {
        Collections.sort((List<E>) this);
    }

    @Override
    public void sort(Comparator<? super E> c) {
        Collections.sort(this, c);
    }

    @Override
    public void swap(int i, int j) {
        Collections.swap(this, i, j);
    }

    //Utility from java.util.Collections
    @Override
    public boolean addAll(E... elements) {
        return Collections.addAll(this, elements);
    }

    @Override
    public boolean disjoint(Collection<?> c) {
        return Collections.disjoint(this, c);
    }

    @Override
    public Enumeration<E> enumeration() {
        return Collections.enumeration(this);
    }

    @Override
    public int frequency(Object o) {
        return Collections.frequency(this, o);
    }

    //list.<E>max()
    @Override
    public <E extends Comparable<? super E>> E max() {
        return Collections.max((Collection<E>) this);
    }

    @Override
    public E max(Comparator<? super E> comp) {
        return Collections.max(this, comp);
    }

    //this.<E>min()
    @Override
    public <E extends Comparable<? super E>> E min() {
        return Collections.min((Collection<E>) this);
    }

    @Override
    public E min(Comparator<? super E> comp) {
        return Collections.min(this, comp);
    }

    @Override
    public boolean all(Predicate<? super E> predicate) {
        return Iterables.all(this, predicate);
    }

    @Override
    public boolean any(Predicate<? super E> predicate) {
        return Iterables.any(this, predicate);
    }

    @Override
    public E find(Predicate<? super E> predicate, E defaultValue) {
        return Iterables.find(this, predicate, defaultValue);
    }

    @Override
    public E find(Predicate<? super E> predicate) {
        return Iterables.find(this, predicate);
    }

    @Override
    public int indexOf(Predicate<? super E> predicate) {
        return Iterables.indexOf(this, predicate);
    }

    @Override
    public boolean removeIf(Predicate<? super E> predicate) {
        return Iterables.removeIf(this, predicate);
    }

    @Override
    public boolean addAll(Iterable<? extends E> elementsToAdd) {
        return Iterables.addAll(this, elementsToAdd);
    }

    @Override
    public boolean addAll(Iterator<? extends E> iterator) {
        return Iterators.addAll(this, iterator);
    }

    @Override
    public yuu.akron.ucollection.another.ArrayList<E> filter(Predicate<? super E> predicate) {
        return new yuu.akron.ucollection.another.ArrayList<E>(Collections2.filter(this, predicate));
    }

    @Override
    public <T> yuu.akron.ucollection.another.ArrayList<T> transform(Function<? super E, T> function) {
        return new yuu.akron.ucollection.another.ArrayList<T>(Collections2.transform(this, function));
    }

    @Override
    public yuu.akron.ucollection.another.ArrayList<E> deepClone() throws IOException, ClassNotFoundException {
        if (this.isEmpty()) {
            return new yuu.akron.ucollection.another.ArrayList<E>();
        }

        yuu.akron.ucollection.another.ArrayList<E> list = new yuu.akron.ucollection.another.ArrayList<E>();

        for (E item : this) {
            if (item instanceof DeepClonable) {
                list.add((E) ((DeepClonable) item).deepClone());
            } else if (item instanceof Serializable) {
                list.add((E) DeepCloneUtils.deepCopy((Serializable) item));
            } else {
                Cloner cloner = new Cloner();
                list.add(cloner.deepClone(item));
            }
        }

        return list;
    }
}
