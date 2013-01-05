package yuu.akron.ucollection;

import java.util.Collection;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class UArrayDeque<E> extends ArrayDequeWithUtility<E> {

    public UArrayDeque(Collection<? extends E> c) {
        super(c);
    }

    public UArrayDeque(int numElements) {
        super(numElements);
    }

    public UArrayDeque() {
        super();
    }

    public UArrayDeque(E... elements) {
        super(elements);
    }
}
