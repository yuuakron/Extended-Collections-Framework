package yuu.akron.ucollection.interfaces;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
interface ListUtility<E> {

    public <E extends Comparable<? super E>> int binarySearch(E key);

    public int binarySearch(E key, Comparator<? super E> c);

    public void copy(List<? super E> dest);

    public void fill(E obj);

    public int indexOfSubList(List<?> target);

    public int lastIndexOfSubList(List<?> target);

    public boolean replaceAll(E oldVal, E newVal);

    public void reverse();

    public void rotate(int distance);

    public void shuffle();

    public void shuffle(Random rnd);

    public <E extends Comparable<? super E>> void sort();

    public void sort(Comparator<? super E> c);

    public void swap(int i, int j);
}
