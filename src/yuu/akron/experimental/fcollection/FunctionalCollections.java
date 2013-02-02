package yuu.akron.experimental.fcollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author yuu@akron
 */
public class FunctionalCollections {

    private FunctionalCollections() {
    }

    public static <E> Collection<E> toCollection(FunctionalCollection<E> c) {
        return Arrays.asList((E[]) c.toArray());
    }

    public static <E> List<E> toList(FunctionalCollection<E> c) {
        return Arrays.asList((E[]) c.toArray());
    }

    public static <E> FunctionalCollection<E> toMutableCollection(Collection<E> c) {
        return new MutableArrayList<E>((E[]) c.toArray());
    }

    public static <E> FunctionalCollection<E> toImmutableCollection(Collection<E> c) {
        return new ImmutableArrayList<E>((E[]) c.toArray());
    }

    public static <E> FunctionalList<E> toMutableList(Collection<E> c) {
        return new MutableArrayList<E>((E[]) c.toArray());
    }

    public static <E> FunctionalList<E> toImmutableList(Collection<E> c) {
        return new ImmutableArrayList<E>((E[]) c.toArray());
    }
}
