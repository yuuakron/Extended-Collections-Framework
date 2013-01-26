package yuu.akron.ucollection.interfaces;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Set;

/**
 *
 * @param <E>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface SetWithUtility<E> extends CollectionWithUtility<E>, Set<E> {

    public Sets.SetView<E> difference(Set<?> set2);

    public Sets.SetView<E> intersection(Set<?> set2);

    public Sets.SetView<E> symmetricDifference(Set<? extends E> set2);

    public Sets.SetView<E> union(Set<? extends E> set2);

    @Override
    public yuu.akron.ucollection.interfaces.another.Set<E> filter(Predicate<? super E> predicate);

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.Set<T> transform(Function<? super E, T> function);

    @Override
    public yuu.akron.ucollection.interfaces.another.Set<E> deepClone() throws IOException, ClassNotFoundException ;
}
