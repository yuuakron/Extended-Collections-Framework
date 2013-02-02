package yuu.akron.ucollection;

import java.util.EnumSet;

/**
 *
 * @param <E> 
 * @author yuu@akron
 *
 *
 */
public class UEnumSet<E extends Enum<E>> extends EnumSetWithUtility<E> {

    protected UEnumSet(EnumSet<E> set) {
        super(set);
    }
}
