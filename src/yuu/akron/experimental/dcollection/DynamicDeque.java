package yuu.akron.experimental.dcollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;

/**
 *
 * @author yuuakron
 */
public class DynamicDeque<E> extends DynamicQueue<E> implements yuu.akron.ucollection.interfaces.another.Deque<E> {

    public static class Builder<E> {

        private Object collection;
        private Interfaces interfaces = Interfaces.Deque;
        private Contents contents = Contents.Normal;

        public Builder() {
        }

        public DynamicDeque<E> build() {

            collection = new ArrayDeque<E>();

            return new DynamicDeque<E>(this);
        }
    }

    protected DynamicDeque() {
    }

    private DynamicDeque(DynamicDeque.Builder<E> builder) {
        collection = builder.collection;
        interfaces = builder.interfaces;
        contents = builder.contents;
    }

    //conversion functions
    public Deque<E> toDeque() {
        if (collection instanceof Deque) {
            return (Deque<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //for Deque
    public void addFirst(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addLast(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterator<E> descendingIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean offerFirst(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean offerLast(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E peekFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E peekLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E pollFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E pollLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void push(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean removeFirstOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean removeLastOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Utility from java.util.Collections
    @Override
    public yuu.akron.ucollection.interfaces.another.Queue<E> asLifoQueue() {
        return new yuu.akron.ucollection.another.ArrayDeque(Collections.asLifoQueue((Deque<E>) collection));
    }

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.Deque<T> transform(Function<? super E, T> function) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Deque<E> deepClone() throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Deque<E> filter(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
