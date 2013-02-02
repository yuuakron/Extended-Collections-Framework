package yuu.akron.ucollection.another;

import java.util.Collection;
import yuu.akron.ucollection.ULinkedList;

/**
 *
 * @param <E> 
 * @author yuu@akron
 *
 *
 */
public class LinkedList<E> extends ULinkedList<E> {

    public LinkedList() {
        super();
    }

    public LinkedList(Collection<? extends E> c) {
        super(c);
    }

    public LinkedList(E... elements) {
        super(elements);
    }
}
