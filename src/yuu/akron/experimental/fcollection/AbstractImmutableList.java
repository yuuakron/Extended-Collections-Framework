package yuu.akron.experimental.fcollection;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @param <E>
 * @author yuu@akron
 */
public abstract class AbstractImmutableList<E> extends AbstractImmutableCollection<E> implements FunctionalList<E> {

    protected E buffer;

    protected AbstractImmutableList() {
    }

    protected abstract List<E> list();

    @Override
    protected Collection<E> collection() {
        return list();
    }

    @Override
    public FunctionalList<E> retainAll(FunctionalCollection<?> c) {
        List<E> newlist = list();
        newlist.retainAll(newlist);
        return FunctionalCollections.toImmutableList(newlist);
    }

    @Override
    public FunctionalList<E> removeAll(FunctionalCollection<?> c) {
        List<E> newlist = list();
        newlist.removeAll(FunctionalCollections.toCollection(c));
        return FunctionalCollections.toImmutableList(newlist);
    }

    @Override
    public FunctionalList<E> subList(int fromIndex, int toIndex) {
        return FunctionalCollections.toImmutableList(list().subList(fromIndex, toIndex));
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return list().listIterator(index);
    }

    @Override
    public ListIterator<E> listIterator() {
        return list().listIterator();
    }

    //java.util.setの返値を一時的にbufferに格納する。
    @Override
    public FunctionalList<E> set(int index, E element) {
        List<E> newlist = list();
        E buff = newlist.set(index, element);
        AbstractImmutableList<E> flist = (AbstractImmutableList<E>) FunctionalCollections.toImmutableList(newlist);
        flist.buffer = buff;
        return flist;
    }

    @Override
    public FunctionalList<E> remove(E o) {
        List<E> newlist = list();
        newlist.remove(o);
        return FunctionalCollections.toImmutableList(newlist);
    }

    //java.util.removeの返値を一時的にbufferに格納する。
    @Override
    public FunctionalList<E> remove(int index) {
        List<E> newlist = list();
        E buff = newlist.remove(index);
        AbstractImmutableList<E> flist = (AbstractImmutableList<E>) FunctionalCollections.toImmutableList(newlist);
        flist.buffer = buff;
        return flist;
    }

    @Override
    public int lastIndexOf(E o) {
        return list().lastIndexOf(o);
    }

    @Override
    public int indexOf(E o) {
        return list().indexOf(o);
    }

    @Override
    public E get(int index) {
        return list().get(index);
    }

    @Override
    public FunctionalList<E> clear() {
        List<E> newlist = list();
        newlist.clear();
        return FunctionalCollections.toImmutableList(newlist);
    }

    @Override
    public FunctionalList<E> addAll(int index, FunctionalCollection<? extends E> c) {
        List<E> newlist = list();
        newlist.addAll(index, FunctionalCollections.toCollection(c));
        return FunctionalCollections.toImmutableList(newlist);
    }

    @Override
    public FunctionalList<E> addAll(FunctionalCollection<? extends E> c) {
        List<E> newlist = list();
        newlist.addAll(FunctionalCollections.toCollection(c));
        return FunctionalCollections.toImmutableList(newlist);
    }

    @Override
    public FunctionalList<E> add(int index, E element) {
        List<E> newlist = list();
        newlist.add(index, element);
        return FunctionalCollections.toImmutableList(newlist);
    }

    @Override
    public FunctionalList<E> add(E e) {
        List<E> newlist = list();
        newlist.add(e);
        return FunctionalCollections.toImmutableList(newlist);
    }

    //直前のE set, E removeの返値の一時バッファを返す。
    @Override
    public E buffer() {
        return buffer;
    }
}
