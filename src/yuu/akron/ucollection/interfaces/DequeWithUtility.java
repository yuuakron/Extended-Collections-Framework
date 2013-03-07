package yuu.akron.ucollection.interfaces;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.Deque;

/**
 *
 * @param <E>
 * @author yuu@akron
 */
public interface DequeWithUtility<E> extends QueueWithUtility<E>, Deque<E> {

    public yuu.akron.ucollection.interfaces.another.Queue<E> asLifoQueue();

    @Override
    public yuu.akron.ucollection.interfaces.another.Deque<E> filter(Predicate<? super E> predicate);

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.Deque<T> transform(Function<? super E, T> function);

    @Override
    public yuu.akron.ucollection.interfaces.another.Deque<E> deepClone();
}
