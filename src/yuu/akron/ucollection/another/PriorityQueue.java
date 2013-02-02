package yuu.akron.ucollection.another;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import yuu.akron.ucollection.UPriorityQueue;

/**
 *
 * @param <E> 
 * @author yuu@akron
 *
 *
 */
public class PriorityQueue<E> extends UPriorityQueue<E> {

    public PriorityQueue(SortedSet<? extends E> c) {
        super(c);
    }

    public PriorityQueue(java.util.PriorityQueue<? extends E> c) {
        super(c);
    }

    public PriorityQueue(Collection<? extends E> c) {
        super(c);
    }

    public PriorityQueue(int initialCapacity, Comparator<? super E> comparator) {
        super(initialCapacity, comparator);
    }

    public PriorityQueue(int initialCapacity) {
        super(initialCapacity);
    }

    public PriorityQueue() {
        super();
    }

    public PriorityQueue(E... elements) {
        super(elements);
    }
}
