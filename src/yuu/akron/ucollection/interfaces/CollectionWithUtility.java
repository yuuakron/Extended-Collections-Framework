package yuu.akron.ucollection.interfaces;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @param <E> 
 * @author yuu@akron
 */
public interface CollectionWithUtility<E> extends IterableWithUtility<E>, Collection<E>{
    public boolean addAll(E... elements);

    public boolean addAll(Iterable<? extends E> elementsToAdd);

    public boolean addAll(Iterator<? extends E> iterator);

    public boolean disjoint(Collection<?> c);

    public Enumeration<E> enumeration();

    public int frequency(java.lang.Object o);

    public <E extends Comparable<? super E>> E max();

    public E max(Comparator<? super E> comp);

    public <E extends Comparable<? super E>> E min();

    public E min(Comparator<? super E> comp);

    public yuu.akron.ucollection.interfaces.another.Collection<E> filter(Predicate<? super E> predicate);

    public <T> yuu.akron.ucollection.interfaces.another.Collection<T> transform(Function<? super E, T> function);
    
    @Override
    public yuu.akron.ucollection.interfaces.another.Collection<E> deepClone() throws IOException, ClassNotFoundException ;
}
