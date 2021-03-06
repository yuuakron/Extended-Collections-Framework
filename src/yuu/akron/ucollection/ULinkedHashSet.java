package yuu.akron.ucollection;

import java.util.Collection;

/**
 *
 * @param <E> 
 * @author yuu@akron
 *
 *
 */
public class ULinkedHashSet<E> extends LinkedHashSetWithUtility<E> {

    public ULinkedHashSet(int initialCapacity) {
        super(initialCapacity);
    }

    public ULinkedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public ULinkedHashSet(Collection<? extends E> c) {
        super(c);
    }

    public ULinkedHashSet() {
        super();
    }

    public ULinkedHashSet(E... elements) {
        super(elements);
    }
}
