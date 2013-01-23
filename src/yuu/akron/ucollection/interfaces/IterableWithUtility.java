package yuu.akron.ucollection.interfaces;

import com.google.common.base.Predicate;
import yuu.akron.ulang.DeepClonable;

/**
 *
 * @param <E> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface IterableWithUtility<E> extends Iterable<E>{ 
    public boolean all(Predicate<? super E> predicate);

    public boolean any(Predicate<? super E> predicate);

    public E find(Predicate<? super E> predicate, E defaultValue);

    public E find(Predicate<? super E> predicate);

    public int indexOf(Predicate<? super E> predicate);

    public boolean removeIf(Predicate<? super E> predicate);
}
