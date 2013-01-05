package yuu.akron.ucollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import java.util.*;

/**
 *
 * @param <E>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class LinkedHashSetWithUtility<E> extends LinkedHashSet<E> implements yuu.akron.ucollection.interfaces.another.Set<E> {

    public LinkedHashSetWithUtility(int initialCapacity) {
        super(initialCapacity);
    }

    public LinkedHashSetWithUtility(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public LinkedHashSetWithUtility(Collection<? extends E> c) {
        super(c);
    }

    public LinkedHashSetWithUtility() {
        super();
    }

    public LinkedHashSetWithUtility(E... elements) {
        super(Arrays.asList(elements));
    }

    public static <E> yuu.akron.ucollection.another.LinkedHashSet<E> newSet() {
        return new yuu.akron.ucollection.another.LinkedHashSet<E>();
    }

    public static <E> yuu.akron.ucollection.another.LinkedHashSet<E> newSet(Collection<? extends E> c) {
        return new yuu.akron.ucollection.another.LinkedHashSet<E>(c);
    }

    public static <E> yuu.akron.ucollection.another.LinkedHashSet<E> newSet(int initialCapacity) {
        return new yuu.akron.ucollection.another.LinkedHashSet<E>(initialCapacity);
    }

    public static <E> yuu.akron.ucollection.another.LinkedHashSet<E> newSet(int initialCapacity, float loadFactor) {
        return new yuu.akron.ucollection.another.LinkedHashSet<E>(initialCapacity, loadFactor);
    }

    public static <E> yuu.akron.ucollection.another.LinkedHashSet<E> newSet(E... elements) {
        return new yuu.akron.ucollection.another.LinkedHashSet<E>(elements);
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
    public yuu.akron.ucollection.another.LinkedHashSet<E> filter(Predicate<? super E> predicate) {
        return new yuu.akron.ucollection.another.LinkedHashSet<E>(Collections2.filter(this, predicate));
    }

    @Override
    public <T> yuu.akron.ucollection.another.LinkedHashSet<T> transform(Function<? super E, T> function) {
        return new yuu.akron.ucollection.another.LinkedHashSet<T>(Collections2.transform(this, function));
    }

    @Override
    public Sets.SetView<E> difference(Set<?> set2) {
        return Sets.difference(this, set2);
    }

    @Override
    public Sets.SetView<E> intersection(Set<?> set2) {
        return Sets.intersection(this, set2);
    }

    @Override
    public Sets.SetView<E> symmetricDifference(Set<? extends E> set2) {
        return Sets.symmetricDifference(this, set2);
    }

    @Override
    public Sets.SetView<E> union(Set<? extends E> set2) {
        return Sets.union(this, set2);
    }

    @Override
    public yuu.akron.ucollection.another.LinkedHashSet<E> clone() {
        return new yuu.akron.ucollection.another.LinkedHashSet(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if ((!(obj instanceof LinkedHashSetWithUtility))
                && (!(obj instanceof ULinkedHashSet))
                && (!(obj instanceof yuu.akron.ucollection.another.LinkedHashSet))) {
            return false;
        }
        final LinkedHashSetWithUtility<E> other = (LinkedHashSetWithUtility<E>) obj;
        if (this != other && (this == null || !super.equals(other))) {
            return false;
        }
        return true;
    }
}
