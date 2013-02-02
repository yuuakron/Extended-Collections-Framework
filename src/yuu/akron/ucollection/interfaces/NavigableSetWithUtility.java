package yuu.akron.ucollection.interfaces;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.NavigableSet;

/**
 *
 * @param <E>
 * @author yuu@akron
 */
public interface NavigableSetWithUtility<E> extends SortedSetWithUtility<E>, NavigableSet<E> {

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> filter(Predicate<? super E> predicate);

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.NavigableSet<T> transform(Function<? super E, T> function);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> deepClone() throws IOException, ClassNotFoundException ;

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> headSet(E toElement);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> subSet(E fromElement, E toElement);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> tailSet(E fromElement);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> descendingSet();

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> headSet(E toElement, boolean inclusive);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> tailSet(E fromElement, boolean inclusive);
}
