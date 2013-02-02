
package yuu.akron.experimental.fcollection;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @param <E> 
 * @author yuu@akron
 */
public abstract class AbstractMutableCollection<E> implements FunctionalCollection<E> {
    protected boolean changedflag = false;

    protected AbstractMutableCollection(){
    }
    
    protected abstract Collection<E> collection();
    
    @Override
    public FunctionalCollection<E> retainAll(FunctionalCollection<?> c) {
        changedflag = collection().retainAll(FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public FunctionalCollection<E> removeAll(FunctionalCollection<?> c) {
        changedflag = collection().removeAll(FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public boolean containsAll(FunctionalCollection<?> c) {
        changedflag = false;
        return collection().containsAll(FunctionalCollections.toCollection(c));
    }

    @Override
    public Iterator<E> iterator() {
        changedflag = false;
        return collection().iterator();
    }

    @Override
    public Object[] toArray() {
        changedflag = false;
        return collection().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        changedflag = false;
        return collection().toArray(a);
    }

    @Override
    public int size() {
        changedflag = false;
        return collection().size();
    }

    @Override
    public FunctionalCollection<E> remove(E o) {
        changedflag = collection().remove(o);
        return this;
    }

    @Override
    public boolean isEmpty() {
        changedflag = false;
        return collection().isEmpty();
    }

    @Override
    public boolean contains(E o) {
        changedflag = false;
        return collection().contains(o);
    }

    @Override
    public FunctionalCollection<E> clear() {
        if (collection().isEmpty()) {
            changedflag = false;
        } else {
            changedflag = true;
        }
        collection().clear();
        return this;
    }

    @Override
    public FunctionalCollection<E> addAll(FunctionalCollection<? extends E> c) {
        changedflag = collection().addAll(FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public FunctionalCollection<E> add(E e) {
        changedflag = collection().add(e);
        return this;
    }

    //java.util.Collection#add(E e)などで内部が変更されるたことを検出する
    //直前の操作の変更のみ知ることができる
    @Override
    public boolean isChaged() {
        return changedflag;
    } 
}
