package yuu.akron.ucollection;

import java.util.Collection;

/**
 *
 * @param <E> 
 * @author yuu@akron
 *
 *
 */
public class UArrayList<E> extends ArrayListWithUtility<E> {

    public UArrayList() {
        super();
    }

    public UArrayList(Collection<? extends E> c) {
        super(c);
    }

    public UArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public UArrayList(E... elements) {
        super(elements);
    }
}
