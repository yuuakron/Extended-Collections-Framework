package yuu.akron.ucollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.rits.cloning.Cloner;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import yuu.akron.ulang.DeepClonable;
import yuu.akron.ulang.DeepCloneUtils;

/**
 *
 * @param <E>
 * @author yuu@akron
 *
 *
 */
public class TreeSetWithUtility<E> extends TreeSet<E> implements yuu.akron.ucollection.interfaces.another.NavigableSet<E> {

    public TreeSetWithUtility(SortedSet<E> s) {
        super(s);
    }

    public TreeSetWithUtility(Collection<? extends E> c) {
        super(c);
    }

    public TreeSetWithUtility(Comparator<? super E> comparator) {
        super(comparator);
    }

    public TreeSetWithUtility() {
        super();
    }

    public TreeSetWithUtility(E... elements) {
        super(Arrays.asList(elements));
    }

    public static <E> yuu.akron.ucollection.another.TreeSet<E> newSet() {
        return new yuu.akron.ucollection.another.TreeSet<E>();
    }

    public static <E> yuu.akron.ucollection.another.TreeSet<E> newSet(Collection<? extends E> c) {
        return new yuu.akron.ucollection.another.TreeSet<E>(c);
    }

    public static <E> yuu.akron.ucollection.another.TreeSet<E> newSet(SortedSet<E> s) {
        return new yuu.akron.ucollection.another.TreeSet<E>(s);
    }

    public static <E> yuu.akron.ucollection.another.TreeSet<E> newSet(Comparator<? super E> comparator) {
        return new yuu.akron.ucollection.another.TreeSet<E>(comparator);
    }

    public static <E> yuu.akron.ucollection.another.TreeSet<E> newSet(E... elements) {
        return new yuu.akron.ucollection.another.TreeSet<E>(elements);
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> tailSet(E fromElement) {
        return new TreeSetWithUtility<E>(super.tailSet(fromElement));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        return new TreeSetWithUtility<E>(super.tailSet(fromElement, inclusive));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> subSet(E fromElement, E toElement) {
        return new TreeSetWithUtility<E>(super.subSet(fromElement, toElement));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return new TreeSetWithUtility<E>(super.subSet(fromElement, fromInclusive, toElement, toInclusive));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> headSet(E toElement) {
        return new TreeSetWithUtility<E>(super.headSet(toElement));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> headSet(E toElement, boolean inclusive) {
        return new TreeSetWithUtility<E>(super.headSet(toElement, inclusive));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<E> descendingSet() {
        return new TreeSetWithUtility<E>(super.descendingSet());
    }

    @Override
    public yuu.akron.ucollection.another.TreeSet<E> clone() {
        return (yuu.akron.ucollection.another.TreeSet<E>)super.clone();
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
    public yuu.akron.ucollection.another.TreeSet<E> filter(Predicate<? super E> predicate) {
        return new yuu.akron.ucollection.another.TreeSet<E>(Collections2.filter(this, predicate));
    }

    @Override
    public <T> yuu.akron.ucollection.another.TreeSet<T> transform(Function<? super E, T> function) {
        return new yuu.akron.ucollection.another.TreeSet<T>(Collections2.transform(this, function));
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
    public yuu.akron.ucollection.another.TreeSet<E> deepClone() throws IOException, ClassNotFoundException {
        if (this.isEmpty()) {
            return new yuu.akron.ucollection.another.TreeSet<E>();
        }

        yuu.akron.ucollection.another.TreeSet<E> set = new yuu.akron.ucollection.another.TreeSet<E>();

        for (E item : this) {
            if (item instanceof DeepClonable) {
                set.add((E) ((DeepClonable) item).deepClone());
            } else if (item instanceof Serializable) {
                set.add((E) DeepCloneUtils.deepCopy((Serializable) item));
            } else {
                Cloner cloner = new Cloner();
                set.add(cloner.deepClone(item));
            }
        }

        return set;
    }
}
