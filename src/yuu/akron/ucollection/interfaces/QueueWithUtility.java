package yuu.akron.ucollection.interfaces;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.Queue;

/**
 *
 * @param <E>
 * @author yuu@akron
 */
public interface QueueWithUtility<E> extends CollectionWithUtility<E>, Queue<E> {

    @Override
    public yuu.akron.ucollection.interfaces.another.Queue<E> filter(Predicate<? super E> predicate);

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.Queue<T> transform(Function<? super E, T> function);

    @Override
    public yuu.akron.ucollection.interfaces.another.Queue<E> deepClone() throws IOException, ClassNotFoundException ;
}
