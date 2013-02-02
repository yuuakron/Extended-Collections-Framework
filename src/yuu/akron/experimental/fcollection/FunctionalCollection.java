package yuu.akron.experimental.fcollection;

/**
 *
 * @param <E>
 *
 * @author yuu@akron
 */
public interface FunctionalCollection<E> extends Iterable<E> {

    FunctionalCollection<E> add(E e);

    FunctionalCollection<E> addAll(FunctionalCollection<? extends E> c);

    FunctionalCollection<E> clear();

    boolean contains(E o);

    boolean containsAll(FunctionalCollection<?> c);

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    boolean isEmpty();

    FunctionalCollection<E> remove(E o);

    FunctionalCollection<E> removeAll(FunctionalCollection<?> c);

    FunctionalCollection<E> retainAll(FunctionalCollection<?> c);

    int size();

    Object[] toArray();

    <T> T[] toArray(T[] a);
    
    boolean isChaged();
}
