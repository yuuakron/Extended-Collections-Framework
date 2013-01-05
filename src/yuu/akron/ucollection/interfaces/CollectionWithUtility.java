package yuu.akron.ucollection.interfaces;

import java.util.Collection;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface CollectionWithUtility<E> extends IterableWithUtility<E>, Collection<E>, CollectionUtility<E> {
}
