package yuu.akron.ucollection;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/**
 *
 * @param <E> 
 * @author yuu@akron
 *
 *
 */
public class UTreeSet<E> extends TreeSetWithUtility<E>{

    public UTreeSet(SortedSet<E> s) {
        super(s);
    }

    public UTreeSet(Collection<? extends E> c) {
        super(c);
    }

    public UTreeSet(Comparator<? super E> comparator) {
        super(comparator);
    }

    public UTreeSet() {
        super();
    }

    public UTreeSet(E... elements){
        super(elements);
    }
}
