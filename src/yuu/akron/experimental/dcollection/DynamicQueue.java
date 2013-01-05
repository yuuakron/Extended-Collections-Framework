/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.experimental.dcollection;

import java.util.PriorityQueue;
import java.util.Queue;
import yuu.akron.ucollection.interfaces.QueueWithUtility;

/**
 *
 * @author yuuakron
 */
public class DynamicQueue<E> extends DynamicCollection<E> implements QueueWithUtility<E> {

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
    public E element() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean offer(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E poll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
