package yuu.akron.ucollection.interfaces;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 *
 * @param <E>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
interface SetUtility<E> {

    public Sets.SetView<E> difference(Set<?> set2);

    public Sets.SetView<E> intersection(Set<?> set2);

    public Sets.SetView<E> symmetricDifference(Set<? extends E> set2);

    public Sets.SetView<E> union(Set<? extends E> set2);
}
