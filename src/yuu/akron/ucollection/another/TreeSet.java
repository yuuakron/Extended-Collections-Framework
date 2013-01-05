package yuu.akron.ucollection.another;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import yuu.akron.ucollection.UTreeSet;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class TreeSet<E> extends UTreeSet<E>{

    public TreeSet(SortedSet<E> s) {
        super(s);
    }

    public TreeSet(Collection<? extends E> c) {
        super(c);
    }

    public TreeSet(Comparator<? super E> comparator) {
        super(comparator);
    }

    public TreeSet() {
        super();
    }

    public TreeSet(E... elements){
        super(elements);
    }
}
