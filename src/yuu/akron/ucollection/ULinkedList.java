package yuu.akron.ucollection;

import java.util.Collection;

/**
 *
 * @param <E> 
 * @author yuu@akron
 *
 *
 */
public class ULinkedList<E> extends LinkedListWithUtility<E> {

    public ULinkedList() {
        super();
    }

    public ULinkedList(Collection<? extends E> c) {
        super(c);
    }

    public ULinkedList(E... elements) {
        super(elements);
    }
}
