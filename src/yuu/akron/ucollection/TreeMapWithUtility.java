package yuu.akron.ucollection;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.rits.cloning.Cloner;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import yuu.akron.ulang.DeepClonable;
import yuu.akron.ulang.DeepCloneUtils;

/**
 *
 * @param <K>
 * @param <V>
 * @author yuu@akron
 *
 *
 */
public class TreeMapWithUtility<K, V> extends TreeMap<K, V> implements yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> {

    public TreeMapWithUtility(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public TreeMapWithUtility() {
        super();
    }

    public TreeMapWithUtility(SortedMap<K, ? extends V> m) {
        super(m);
    }

    public TreeMapWithUtility(Comparator<? super K> comparator) {
        super(comparator);
    }

    public static <K, V> TreeMapWithUtility<K, V> newMap() {
        return new TreeMapWithUtility<K, V>();
    }

    public static <K, V> TreeMapWithUtility<K, V> newMap(Map<? extends K, ? extends V> m) {
        return new TreeMapWithUtility<K, V>(m);
    }

    public static <K, V> TreeMapWithUtility<K, V> newMap(SortedMap<K, ? extends V> m) {
        return new TreeMapWithUtility<K, V>(m);
    }

    public static <K, V> TreeMapWithUtility<K, V> newMap(Comparator<? super K> comparator) {
        return new TreeMapWithUtility<K, V>(comparator);
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Collection<V> values() {
        return new ArrayListWithUtility<V>(super.values());
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Set<K> keySet() {
        return new HashSetWithUtility<K>(super.keySet());
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Set<Entry<K, V>> entrySet() {
        return new HashSetWithUtility<Entry<K, V>>(super.entrySet());
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> tailMap(K fromKey) {
        return new TreeMapWithUtility<K, V>(super.tailMap(fromKey));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> subMap(K fromKey, K toKey) {
        return new TreeMapWithUtility<K, V>(super.subMap(fromKey, toKey));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> headMap(K toKey) {
        return new TreeMapWithUtility<K, V>(super.headMap(toKey));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
        return new TreeMapWithUtility<K, V>(((NavigableMap<K, V>) this).tailMap(fromKey, inclusive));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
        return new TreeMapWithUtility<K, V>(((NavigableMap<K, V>) this).subMap(fromKey, fromInclusive, toKey, toInclusive));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<K> navigableKeySet() {
        return new TreeSetWithUtility<K>(((NavigableMap<K, V>) this).navigableKeySet());
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
        return new TreeMapWithUtility<K, V>(((NavigableMap<K, V>) this).headMap(toKey, inclusive));
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> descendingMap() {
        return new TreeMapWithUtility<K, V>(((NavigableMap<K, V>) this).descendingMap());
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<K> descendingKeySet() {
        return new TreeSetWithUtility<K>(((NavigableMap<K, V>) this).descendingKeySet());
    }

    @Override
    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right) {
        return Maps.difference(this, right);
    }

    @Override
    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right, Equivalence<? super V> valueEquivalence) {
        return Maps.difference(this, right, valueEquivalence);
    }

    @Override
    public yuu.akron.ucollection.another.TreeMap<K, V> filterEntries(Predicate<? super Entry<K, V>> entryPredicate) {
        return new yuu.akron.ucollection.another.TreeMap<K, V>(Maps.filterEntries(this, entryPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.TreeMap<K, V> filterKeys(Predicate<? super K> keyPredicate) {
        return new yuu.akron.ucollection.another.TreeMap<K, V>(Maps.filterKeys(this, keyPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.TreeMap<K, V> filterValues(Predicate<? super V> valuePredicate) {
        return new yuu.akron.ucollection.another.TreeMap<K, V>(Maps.filterValues(this, valuePredicate));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.TreeMap<K, V2> transformEntries(Maps.EntryTransformer<? super K, ? super V, V2> transformer) {
        return new yuu.akron.ucollection.another.TreeMap<K, V2>(Maps.transformEntries(this, transformer));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.TreeMap<K, V2> transformValues(Function<? super V, V2> function) {
        return new yuu.akron.ucollection.another.TreeMap<K, V2>(Maps.transformValues(this, function));
    }

    @Override
    public yuu.akron.ucollection.another.TreeMap<K, V> clone() {
        return (yuu.akron.ucollection.another.TreeMap<K, V>) super.clone();
    }

    @Override
    public yuu.akron.ucollection.another.TreeMap<K, V> deepClone() throws IOException, ClassNotFoundException {
        yuu.akron.ucollection.another.TreeMap<K, V> map = new yuu.akron.ucollection.another.TreeMap<K, V>();

        if (this.isEmpty()) {
            return map;
        }

        for (Map.Entry<K, V> item : this.entrySet()) {
            K key = item.getKey();
            V value = item.getValue();

            if (key instanceof DeepClonable) {
                key = (K) ((DeepClonable) key).deepClone();
            } else if (key instanceof Serializable) {
                key = DeepCloneUtils.deepCopy(key);
            } else {
                Cloner cloner = new Cloner();
                key = cloner.deepClone(key);
            }

            if (value instanceof DeepClonable) {
                value = (V) ((DeepClonable) value).deepClone();
            } else if (value instanceof Serializable) {
                value = DeepCloneUtils.deepCopy(value);
            } else {
                Cloner cloner = new Cloner();
                value = cloner.deepClone(value);
            }

            map.put(key, value);
        }

        return map;
    }
}
