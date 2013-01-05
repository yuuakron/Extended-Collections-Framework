package yuu.akron.ucollection.interfaces;

import java.util.Deque;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface DequeWithUtility<E> extends QueueWithUtility<E>, Deque<E>, DequeUtility<E> {
}
