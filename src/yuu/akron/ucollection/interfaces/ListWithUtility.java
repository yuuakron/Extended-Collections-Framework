package yuu.akron.ucollection.interfaces;

import java.util.List;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface ListWithUtility<E> extends CollectionWithUtility<E>, List<E>, ListUtility<E> {
}
