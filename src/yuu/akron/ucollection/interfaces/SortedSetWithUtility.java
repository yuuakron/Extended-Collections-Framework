package yuu.akron.ucollection.interfaces;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.SortedSet;

/**
 *
 * @param <E>
 * @author yuu@akron
 */
public interface SortedSetWithUtility<E> extends SetWithUtility<E>, SortedSet<E> {

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedSet<E> filter(Predicate<? super E> predicate);

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.SortedSet<T> transform(Function<? super E, T> function);

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedSet<E> deepClone() throws IOException, ClassNotFoundException ;

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedSet<E> headSet(E toElement);

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedSet<E> subSet(E fromElement, E toElement);

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedSet<E> tailSet(E fromElement);
}
