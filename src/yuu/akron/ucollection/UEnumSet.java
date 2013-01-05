package yuu.akron.ucollection;

import java.util.EnumSet;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class UEnumSet<E extends Enum<E>> extends EnumSetWithUtility<E> {

    protected UEnumSet(EnumSet<E> set) {
        super(set);
    }
}
