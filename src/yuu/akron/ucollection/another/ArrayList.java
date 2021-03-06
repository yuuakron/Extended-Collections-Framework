package yuu.akron.ucollection.another;

import java.util.Collection;
import yuu.akron.ucollection.UArrayList;

/**
 *
 * @param <E> 
 * @author yuu@akron
 */
public class ArrayList<E> extends UArrayList<E> {

    public ArrayList() {
        super();
    }

    public ArrayList(Collection<? extends E> c) {
        super(c);
    }

    public ArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public ArrayList(E... elements) {
        super(elements);
    }
}
