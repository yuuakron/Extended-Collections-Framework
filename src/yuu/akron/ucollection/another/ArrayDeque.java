package yuu.akron.ucollection.another;

import java.util.Collection;
import yuu.akron.ucollection.UArrayDeque;

/**
 *
 * @param <E> 
 * @author yuu@akron
 */
public class ArrayDeque<E> extends UArrayDeque<E> {

    public ArrayDeque(Collection<? extends E> c) {
        super(c);
    }

    public ArrayDeque(int numElements) {
        super(numElements);
    }

    public ArrayDeque() {
        super();
    }

    public ArrayDeque(E... elements) {
        super(elements);
    }
}
