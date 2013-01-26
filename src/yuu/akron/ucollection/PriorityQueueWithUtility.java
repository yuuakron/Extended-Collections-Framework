package yuu.akron.ucollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.rits.cloning.Cloner;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import yuu.akron.ulang.DeepClonable;
import yuu.akron.ulang.DeepCloneUtils;

/**
 *
 * @param <E>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class PriorityQueueWithUtility<E> extends PriorityQueue<E> implements yuu.akron.ucollection.interfaces.another.Queue<E> {

    public PriorityQueueWithUtility(SortedSet<? extends E> c) {
        super(c);
    }

    public PriorityQueueWithUtility(PriorityQueue<? extends E> c) {
        super(c);
    }

    public PriorityQueueWithUtility(Collection<? extends E> c) {
        super(c);
    }

    public PriorityQueueWithUtility(int initialCapacity, Comparator<? super E> comparator) {
        super(initialCapacity, comparator);
    }

    public PriorityQueueWithUtility(int initialCapacity) {
        super(initialCapacity);
    }

    public PriorityQueueWithUtility() {
        super();
    }

    public PriorityQueueWithUtility(E... elements) {
        super(Arrays.asList(elements));
    }

    public static <E> yuu.akron.ucollection.another.PriorityQueue<E> newQueue(SortedSet<? extends E> c) {
        return new yuu.akron.ucollection.another.PriorityQueue<E>(c);
    }

    public static <E> PriorityQueueWithUtility<E> newQueue(PriorityQueue<? extends E> c) {
        return new yuu.akron.ucollection.another.PriorityQueue<E>(c);
    }

    public static <E> yuu.akron.ucollection.another.PriorityQueue<E> newQueue(Collection<? extends E> c) {
        return new yuu.akron.ucollection.another.PriorityQueue<E>(c);
    }

    public static <E> yuu.akron.ucollection.another.PriorityQueue<E> newQueue(int initialCapacity, Comparator<? super E> comparator) {
        return new yuu.akron.ucollection.another.PriorityQueue<E>(initialCapacity, comparator);
    }

    public static <E> yuu.akron.ucollection.another.PriorityQueue<E> newQueue(int initialCapacity) {
        return new yuu.akron.ucollection.another.PriorityQueue<E>(initialCapacity);
    }

    public static <E> yuu.akron.ucollection.another.PriorityQueue<E> newQueue() {
        return new yuu.akron.ucollection.another.PriorityQueue<E>();
    }

    public static <E> yuu.akron.ucollection.another.PriorityQueue<E> newQueue(E... elements) {
        return new yuu.akron.ucollection.another.PriorityQueue<E>(Arrays.asList(elements));
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
    public yuu.akron.ucollection.another.PriorityQueue<E> filter(Predicate<? super E> predicate) {
        return new yuu.akron.ucollection.another.PriorityQueue<E>(Collections2.filter(this, predicate));
    }

    @Override
    public <T> yuu.akron.ucollection.another.PriorityQueue<T> transform(Function<? super E, T> function) {
        return new yuu.akron.ucollection.another.PriorityQueue<T>(Collections2.transform(this, function));
    }

    @Override
    public yuu.akron.ucollection.another.PriorityQueue<E> clone() {
        try {
            return (yuu.akron.ucollection.another.PriorityQueue<E>)super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(PriorityQueueWithUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public yuu.akron.ucollection.another.PriorityQueue<E> deepClone() throws IOException, ClassNotFoundException {
        if (this.isEmpty()) {
            return new yuu.akron.ucollection.another.PriorityQueue<E>();
        }

        yuu.akron.ucollection.another.PriorityQueue<E> queue = new yuu.akron.ucollection.another.PriorityQueue<E>();

        for (E item : this) {
            if (item instanceof DeepClonable) {
                queue.add((E) ((DeepClonable) item).deepClone());
            } else if (item instanceof Serializable) {
                queue.add((E) DeepCloneUtils.deepCopy((Serializable) item));
            } else {
                Cloner cloner = new Cloner();
                queue.add(cloner.deepClone(item));
            }
        }

        return queue;
    }
}
