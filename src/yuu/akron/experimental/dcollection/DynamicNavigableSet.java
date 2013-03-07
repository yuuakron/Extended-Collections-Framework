package yuu.akron.experimental.dcollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author yuuakron
 */
public class DynamicNavigableSet<E> extends DynamicSet<E> implements yuu.akron.ucollection.interfaces.another.NavigableSet<E> {

    public static class Builder<E> {

        private Object collection;
        private Interfaces interfaces = Interfaces.NavigableSet;
        private Contents contents = Contents.Normal;

        public Builder() {
        }

        public DynamicSet<E> build() {

            collection = new TreeSet<E>();

            return new DynamicNavigableSet<E>(this);
        }
    }

    protected DynamicNavigableSet() {
    }

    private DynamicNavigableSet(Builder<E> builder) {
        collection = builder.collection;
        interfaces = builder.interfaces;
        contents = builder.contents;
    }

    //conversion functions
    public SortedSet<E> toSortedSet() {
        if (collection instanceof SortedSet) {
            return (SortedSet<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableSet<E> toNavigableSet() {
        if (collection instanceof NavigableSet) {
            return (NavigableSet<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //for SortedSet
    @Override
    public Comparator<? super E> comparator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E first() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E last() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Utility form java.util.Collections
    public SortedSet<E> checkedSortedSet(Class<E> type) {
        return Collections.checkedSortedSet((SortedSet<E>) collection, type);
    }

    public SortedSet<E> unmodifiableSortedSet() {
        return Collections.unmodifiableSortedSet((SortedSet<E>) collection);
    }

    public SortedSet<E> synchronizedSortedSet() {
        return Collections.synchronizedSortedSet((SortedSet<E>) collection);
    }

    //for NavigableSet
    public E ceiling(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterator<E> descendingIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E floor(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E higher(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E lower(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E pollFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E pollLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> yuu.akron.ucollection.interfaces.another. NavigableSet<T> transform(Function<? super E, T> function) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> deepClone(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> descendingSet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> filter(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> headSet(E toElement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> headSet(E toElement, boolean inclusive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> subSet(E fromElement, E toElement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> tailSet(E fromElement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
