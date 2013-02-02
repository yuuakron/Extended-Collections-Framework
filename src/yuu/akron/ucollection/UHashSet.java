package yuu.akron.ucollection;

import java.util.Collection;

/**
 *
 * @param <E> 
 * @author yuu@akron
 *
 *
 */
public class UHashSet<E> extends HashSetWithUtility<E> {

    public UHashSet(int initialCapacity) {
        super(initialCapacity);
    }

    public UHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public UHashSet(Collection<? extends E> c) {
        super(c);
    }

    public UHashSet() {
        super();
    }

    public UHashSet(E... elements) {
        super(elements);
    }
}
