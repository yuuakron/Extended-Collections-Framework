package yuu.akron.ucollection;

import java.util.Collection;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
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
