package yuu.akron.ucollection.interfaces;

import java.util.Queue;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface QueueWithUtility<E> extends CollectionWithUtility<E>, Queue<E>, QueueUtility<E> {
}
