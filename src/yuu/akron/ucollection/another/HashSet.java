package yuu.akron.ucollection.another;

import java.util.Collection;
import yuu.akron.ucollection.UHashSet;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class HashSet<E> extends UHashSet<E> {

    public HashSet(int initialCapacity) {
        super(initialCapacity);
    }

    public HashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public HashSet(Collection<? extends E> c) {
        super(c);
    }

    public HashSet() {
        super();
    }

    public HashSet(E... elements) {
        super(elements);
    }
}
