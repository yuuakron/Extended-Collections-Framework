
package yuu.akron.experimental.fcollection;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public abstract class AbstractImmutableCollection<E> implements FunctionalCollection<E> {
    protected AbstractImmutableCollection(){
    }
    
    protected abstract Collection<E> collection();
    
    @Override
    public FunctionalCollection<E> retainAll(FunctionalCollection<?> c) {
        Collection<E> newcollection = collection();
        newcollection.retainAll(FunctionalCollections.toCollection(c));
        return FunctionalCollections.toImmutableCollection(newcollection);
    }

    @Override
    public FunctionalCollection<E> removeAll(FunctionalCollection<?> c) {
        Collection<E> newcollection = collection();
        newcollection.removeAll(FunctionalCollections.toCollection(c));
        return FunctionalCollections.toImmutableCollection(newcollection);
    }

    @Override
    public boolean containsAll(FunctionalCollection<?> c) {
        return collection().containsAll(FunctionalCollections.toCollection(c));
    }

    @Override
    public Iterator<E> iterator() {
        return collection().iterator();
    }

    @Override
    public Object[] toArray() {
        return collection().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return collection().toArray(a);
    }

    @Override
    public int size() {
        return collection().size();
    }

    @Override
    public FunctionalCollection<E> remove(E o) {
        Collection<E> newcollection = collection();
        newcollection.remove(o);
        return FunctionalCollections.toImmutableCollection(newcollection);
    }

    @Override
    public boolean isEmpty() {
        return collection().isEmpty();
    }

    @Override
    public boolean contains(E o) {
        return collection().contains(o);
    }

    @Override
    public FunctionalCollection<E> clear() {
        Collection<E> newcollection = collection();
        newcollection.clear();
        return FunctionalCollections.toImmutableCollection(newcollection);
    }

    @Override
    public FunctionalCollection<E> addAll(FunctionalCollection<? extends E> c) {
        Collection<E> newcollection = collection();
        newcollection.addAll(FunctionalCollections.toCollection(c));
        return FunctionalCollections.toImmutableCollection(newcollection);
    }

    @Override
    public FunctionalCollection<E> add(E e) {
        Collection<E> newcollection = collection();
        newcollection.add(e);
        return FunctionalCollections.toImmutableCollection(newcollection);
    }

    //java.util.Collection#add(E e)などで内部が変更されるたことを検出する
    //直前の操作の変更のみ知ることができる
    @Override
    public boolean isChaged() {
        return false;
    } 
}
