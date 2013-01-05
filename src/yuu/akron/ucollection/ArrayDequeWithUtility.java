package yuu.akron.ucollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.*;

/**
 *
 * @param <E>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class ArrayDequeWithUtility<E> extends ArrayDeque<E> implements yuu.akron.ucollection.interfaces.another.Deque<E> {

    public ArrayDequeWithUtility(Collection<? extends E> c) {
        super(c);
    }

    public ArrayDequeWithUtility(int numElements) {
        super(numElements);
    }

    public ArrayDequeWithUtility() {
        super();
    }

    public ArrayDequeWithUtility(E... elements) {
        super(Arrays.asList(elements));
    }

    public static <E> yuu.akron.ucollection.another.ArrayDeque<E> newDeque() {
        return new yuu.akron.ucollection.another.ArrayDeque<E>();
    }

    public static <E> yuu.akron.ucollection.another.ArrayDeque<E> newDeque(Collection<? extends E> c) {
        return new yuu.akron.ucollection.another.ArrayDeque<E>(c);
    }

    public static <E> yuu.akron.ucollection.another.ArrayDeque<E> newDeque(int numElements) {
        return new yuu.akron.ucollection.another.ArrayDeque<E>(numElements);
    }

    public static <E> yuu.akron.ucollection.another.ArrayDeque<E> newDeque(E... elements) {
        return new yuu.akron.ucollection.another.ArrayDeque<E>(elements);
    }


    @Override
    public yuu.akron.ucollection.another.ArrayDeque<E> clone() {
        return new yuu.akron.ucollection.another.ArrayDeque<E>(this);
    }

    @Override
    public boolean addAll(E... elements) {
        return Collections.addAll(this, elements);
    }

    @Override
    public boolean disjoint(Collection<?> c) {
        return Collections.disjoint(this, c);
    }

    @Override
    public Enumeration<E> enumeration() {
        return Collections.enumeration(this);
    }

    @Override
    public int frequency(Object o) {
        return Collections.frequency(this, o);
    }

    @Override
    public <E extends Comparable<? super E>> E max() {
        return Collections.max((Collection<E>) this);
    }

    @Override
    public E max(Comparator<? super E> comp) {
        return Collections.max(this, comp);
    }

    @Override
    public <E extends Comparable<? super E>> E min() {
        return Collections.min((Collection<E>) this);
    }

    @Override
    public E min(Comparator<? super E> comp) {
        return Collections.min(this, comp);
    }

    //要調査
    @Override
    public yuu.akron.ucollection.interfaces.another.Queue<E> asLifoQueue() {
        return new ArrayDequeWithUtility<E>(Collections.asLifoQueue(this));
    }

    @Override
    public boolean all(Predicate<? super E> predicate) {
        return Iterables.all(this, predicate);
    }

    @Override
    public boolean any(Predicate<? super E> predicate) {
        return Iterables.any(this, predicate);
    }

    @Override
    public E find(Predicate<? super E> predicate, E defaultValue) {
        return Iterables.find(this, predicate, defaultValue);
    }

    @Override
    public E find(Predicate<? super E> predicate) {
        return Iterables.find(this, predicate);
    }

    @Override
    public int indexOf(Predicate<? super E> predicate) {
        return Iterables.indexOf(this, predicate);
    }

    @Override
    public boolean removeIf(Predicate<? super E> predicate) {
        return Iterables.removeIf(this, predicate);
    }

    @Override
    public boolean addAll(Iterable<? extends E> elementsToAdd) {
        return Iterables.addAll(this, elementsToAdd);
    }

    @Override
    public boolean addAll(Iterator<? extends E> iterator) {
        return Iterators.addAll(this, iterator);
    }

    @Override
    public yuu.akron.ucollection.another.ArrayDeque<E> filter(Predicate<? super E> predicate) {
        return new yuu.akron.ucollection.another.ArrayDeque<E>(Collections2.filter(this, predicate));
    }

    @Override
    public <T> yuu.akron.ucollection.another.ArrayDeque<T> transform(Function<? super E, T> function) {
        return new yuu.akron.ucollection.another.ArrayDeque<T>(Collections2.transform(this, function));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if ((!(obj instanceof ArrayDequeWithUtility))
                && (!(obj instanceof UArrayDeque))
                && (!(obj instanceof yuu.akron.ucollection.another.ArrayDeque))) {
            return false;
        }
        final ArrayDequeWithUtility<E> other = (ArrayDequeWithUtility<E>) obj;
        if (this != other && (this == null || !super.equals(other))) {
            return false;
        }
        return true;
    }
}