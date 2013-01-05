
package yuu.akron.experimental.fcollection;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public abstract class AbstractMutableList<E> extends AbstractMutableCollection<E> implements FunctionalList<E> {
    protected E buffer;

    protected AbstractMutableList(){
    }

    protected abstract List<E> list();
    protected abstract void setList(List<E> l);
    
    @Override
    protected Collection<E> collection(){
        return list();
    }
    
    @Override
    public FunctionalList<E> retainAll(FunctionalCollection<?> c) {
        changedflag = list().retainAll(FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public FunctionalList<E> removeAll(FunctionalCollection<?> c) {
        changedflag = list().removeAll(FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public FunctionalList<E> subList(int fromIndex, int toIndex) {
        List<E> list = list().subList(fromIndex, toIndex);
        setList(list);
        changedflag = true;
        return this;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        changedflag = false;
        return list().listIterator(index);
    }

    @Override
    public ListIterator<E> listIterator() {
        changedflag = false;
        return list().listIterator();
    }

    //java.util.setの返値を一時的にbufferに格納する。
    @Override
    public FunctionalList<E> set(int index, E element) {
        buffer = list().set(index, element);
        changedflag = true;
        return this;
    }

    @Override
    public FunctionalList<E> remove(E o) {
        changedflag = list().remove(o);
        return this;
    }

    //java.util.removeの返値を一時的にbufferに格納する。
    @Override
    public FunctionalList<E> remove(int index) {
        buffer = list().remove(index);
        changedflag = true;
        return this;
    }

    @Override
    public int lastIndexOf(E o) {
        changedflag = false;
        return list().lastIndexOf(o);
    }

    @Override
    public int indexOf(E o) {
        changedflag = false;
        return list().indexOf(o);
    }

    @Override
    public E get(int index) {
        changedflag = false;
        return list().get(index);
    }

    @Override
    public FunctionalList<E> clear() {
        if (list().isEmpty()) {
            changedflag = false;
        } else {
            changedflag = true;
        }
        list().clear();
        return this;
    }

    @Override
    public FunctionalList<E> addAll(int index, FunctionalCollection<? extends E> c) {
        changedflag = list().addAll(index, FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public FunctionalList<E> addAll(FunctionalCollection<? extends E> c) {
        changedflag = list().addAll(FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public FunctionalList<E> add(int index, E element) {
        list().add(index, element);
        changedflag = true;
        return this;
    }

    @Override
    public FunctionalList<E> add(E e) {
        changedflag = list().add(e);
        return this;
    }

    //直前のE set, E removeの返値の一時バッファを返す。
    @Override
    public E buffer() {
        return buffer;
    }
}
