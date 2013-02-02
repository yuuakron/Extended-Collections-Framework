package yuu.akron.ucollection.another;

import java.util.Collection;
import yuu.akron.ucollection.ULinkedHashSet;

/**
 *
 * @param <E> 
 * @author yuu@akron
 *
 *
 */
public class LinkedHashSet<E> extends ULinkedHashSet<E> {

    public LinkedHashSet(int initialCapacity) {
        super(initialCapacity);
    }

    public LinkedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public LinkedHashSet(Collection<? extends E> c) {
        super(c);
    }

    public LinkedHashSet() {
        super();
    }

    public LinkedHashSet(E... elements) {
        super(elements);
    }
}
