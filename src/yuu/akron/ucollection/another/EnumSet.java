package yuu.akron.ucollection.another;

import yuu.akron.ucollection.UEnumSet;

/**
 *
 * @param <E>
 * @author yuu@akron
 */
public class EnumSet<E extends Enum<E>> extends UEnumSet<E> {

    protected EnumSet(java.util.EnumSet<E> set) {
        super(set);
    }

    public static <E extends Enum<E>> EnumSet<E> copyOf(java.util.EnumSet<E> s) {
        return new EnumSet<E>(java.util.EnumSet.copyOf(s));
    }
}
