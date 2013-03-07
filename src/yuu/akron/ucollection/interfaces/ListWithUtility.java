package yuu.akron.ucollection.interfaces;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @param <E>
 * @author yuu@akron
 */
public interface ListWithUtility<E> extends CollectionWithUtility<E>, List<E> {

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

    @Override
    public yuu.akron.ucollection.interfaces.another.List<E> subList(int fromIndex, int toIndex);
    
    @Override
    public yuu.akron.ucollection.interfaces.another.List<E> filter(Predicate<? super E> predicate);

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.List<T> transform(Function<? super E, T> function);

    @Override
    public yuu.akron.ucollection.interfaces.another.List<E> deepClone();
}
