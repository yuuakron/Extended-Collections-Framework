package yuu.akron.ucollection.interfaces;

import java.util.Set;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface SetWithUtility<E> extends CollectionWithUtility<E>, Set<E>, SetUtility<E> {
}
