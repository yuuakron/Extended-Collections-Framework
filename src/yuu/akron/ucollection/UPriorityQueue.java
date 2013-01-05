package yuu.akron.ucollection;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class UPriorityQueue<E> extends PriorityQueueWithUtility<E> {

    public UPriorityQueue(SortedSet<? extends E> c) {
        super(c);
    }

    public UPriorityQueue(PriorityQueue<? extends E> c) {
        super(c);
    }

    public UPriorityQueue(Collection<? extends E> c) {
        super(c);
    }

    public UPriorityQueue(int initialCapacity, Comparator<? super E> comparator) {
        super(initialCapacity, comparator);
    }

    public UPriorityQueue(int initialCapacity) {
        super(initialCapacity);
    }

    public UPriorityQueue() {
        super();
    }

    public UPriorityQueue(E... elements) {
        super(elements);
    }
}
