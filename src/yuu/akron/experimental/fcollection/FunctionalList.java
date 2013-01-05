package yuu.akron.experimental.fcollection;

import java.util.ListIterator;

/**
 *
 * @param <E>
 *
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface FunctionalList<E> extends FunctionalCollection<E> {

    FunctionalList<E> add(int index, E element);

    FunctionalList<E> addAll(int index, FunctionalCollection<? extends E> c);

    E get(int index);

    int indexOf(E o);

    int lastIndexOf(E o);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int index);

    FunctionalList<E> remove(int index);

    FunctionalList<E> set(int index, E element);

    FunctionalList<E> subList(int fromIndex, int toIndex);

    @Override
    FunctionalList<E> add(E e);

    @Override
    FunctionalList<E> addAll(FunctionalCollection<? extends E> c);

    @Override
    FunctionalList<E> clear();

    @Override
    FunctionalList<E> remove(E o);

    @Override
    FunctionalList<E> removeAll(FunctionalCollection<?> c);

    @Override
    FunctionalList<E> retainAll(FunctionalCollection<?> c);
    
    E buffer();
}
