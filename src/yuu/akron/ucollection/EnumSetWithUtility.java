package yuu.akron.ucollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.*;

/**
 *
 * @param <E>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class EnumSetWithUtility<E extends Enum<E>> implements yuu.akron.ucollection.interfaces.another.Set<E> {

    private static final long serialVersionUID = 1L;
    private EnumSet<E> set;

    protected EnumSetWithUtility(EnumSet<E> set) {
        this.set = set;
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> range(E from, E to) {
        return copyOf(EnumSet.range(from, to));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> of(E first, E... rest) {
        return copyOf(EnumSet.of(first, rest));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> of(E e1, E e2, E e3, E e4, E e5) {
        return copyOf(EnumSet.of(e1, e2, e3, e4, e5));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> of(E e1, E e2, E e3, E e4) {
        return copyOf(EnumSet.of(e1, e2, e3, e4));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> of(E e1, E e2, E e3) {
        return copyOf(EnumSet.of(e1, e2, e3));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> of(E e1, E e2) {
        return copyOf(EnumSet.of(e1, e2));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> of(E e) {
        return copyOf(EnumSet.of(e));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> noneOf(Class<E> elementType) {
        return copyOf(EnumSet.noneOf(elementType));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> copyOf(Collection<E> c) {
        return copyOf(EnumSet.copyOf(c));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> copyOf(EnumSet<E> s) {
        return yuu.akron.ucollection.another.EnumSet.copyOf(s);
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> complementOf(EnumSet<E> s) {
        return copyOf(EnumSet.complementOf(s));
    }

    public static <E extends Enum<E>> yuu.akron.ucollection.another.EnumSet<E> allOf(Class<E> elementType) {
        return copyOf(EnumSet.allOf(elementType));
    }

    @Override
    public yuu.akron.ucollection.another.EnumSet<E> clone() {
        return copyOf(set);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public Iterator<E> iterator() {
        return set.iterator();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return set.addAll(c);
    }

    @Override
    public boolean add(E e) {
        return set.add(e);
    }

    @Override
    public boolean addAll(E... elements) {
        return Collections.addAll(set, elements);
    }

    @Override
    public boolean disjoint(Collection<?> c) {
        return Collections.disjoint(set, c);
    }

    @Override
    public Enumeration<E> enumeration() {
        return Collections.enumeration(set);
    }

    @Override
    public int frequency(Object o) {
        return Collections.frequency(set, o);
    }

    @Override
    public <E extends Comparable<? super E>> E max() {
        return Collections.max((Collection<E>) set);
    }

    @Override
    public E max(Comparator<? super E> comp) {
        return Collections.max(set, comp);
    }

    @Override
    public <E extends Comparable<? super E>> E min() {
        return Collections.min((Collection<E>) set);
    }

    @Override
    public E min(Comparator<? super E> comp) {
        return Collections.min(set, comp);
    }

    @Override
    public boolean all(Predicate<? super E> predicate) {
        return Iterables.all(set, predicate);
    }

    @Override
    public boolean any(Predicate<? super E> predicate) {
        return Iterables.any(set, predicate);
    }

    @Override
    public E find(Predicate<? super E> predicate, E defaultValue) {
        return Iterables.find(set, predicate, defaultValue);
    }

    @Override
    public E find(Predicate<? super E> predicate) {
        return Iterables.find(set, predicate);
    }

    @Override
    public int indexOf(Predicate<? super E> predicate) {
        return Iterables.indexOf(set, predicate);
    }

    @Override
    public boolean removeIf(Predicate<? super E> predicate) {
        return Iterables.removeIf(set, predicate);
    }

    @Override
    public boolean addAll(Iterable<? extends E> elementsToAdd) {
        return Iterables.addAll(set, elementsToAdd);
    }

    @Override
    public boolean addAll(Iterator<? extends E> iterator) {
        return Iterators.addAll(set, iterator);
    }

    @Override
    public yuu.akron.ucollection.another.EnumSet<E> filter(Predicate<? super E> predicate) {
        return copyOf(Collections2.filter(set, predicate));
    }

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.Set<T> transform(Function<? super E, T> function) {
        return new yuu.akron.ucollection.HashSetWithUtility<T>(Collections2.transform(set, function));
    }

    //transformメソッドだと型引数の制限に引っかかるため
    public <T extends Enum<T>> yuu.akron.ucollection.another.EnumSet<T> transformEnum(Function<? super E, T> function) {
        return copyOf(Collections2.transform(set, function));
    }

    @Override
    public SetView<E> difference(Set<?> set2) {
        return Sets.difference(set, set2);
    }

    @Override
    public SetView<E> intersection(Set<?> set2) {
        return Sets.intersection(set, set2);
    }

    @Override
    public SetView<E> symmetricDifference(Set<? extends E> set2) {
        return Sets.symmetricDifference(set, set2);
    }

    @Override
    public SetView<E> union(Set<? extends E> set2) {
        return Sets.union(set, set2);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if ((!(obj instanceof EnumSetWithUtility))
                && (!(obj instanceof UEnumSet))
                && (!(obj instanceof yuu.akron.ucollection.another.EnumSet))) {
            return false;
        }
        final EnumSetWithUtility<E> other = (EnumSetWithUtility<E>) obj;
        if (this.set != other.set && (this.set == null || !this.set.equals(other.set))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return set.hashCode();
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
