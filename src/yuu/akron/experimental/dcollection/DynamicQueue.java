package yuu.akron.experimental.dcollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author yuuakron
 */
public class DynamicQueue<E> extends DynamicCollection<E> implements yuu.akron.ucollection.interfaces.another.Queue<E> {

    public static class Builder<E> {

        private Object collection;
        private Interfaces interfaces = Interfaces.Set;
        private Contents contents = Contents.Normal;

        public Builder() {
        }

        public DynamicQueue<E> build() {

            collection = new PriorityQueue<E>();

            return new DynamicQueue<E>(this);
        }
    }

    protected DynamicQueue() {
    }

    private DynamicQueue(DynamicQueue.Builder<E> builder) {
        collection = builder.collection;
        interfaces = builder.interfaces;
        contents = builder.contents;
    }

    //conversion function
    public Queue<E> toQueue() {
        if (collection instanceof Queue) {
            return (Queue<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //for Queue
    @Override
    public E element() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean offer(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E poll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Queue<E> deepClone() throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Queue<E> filter(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.Queue<T> transform(Function<? super E, T> function) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
