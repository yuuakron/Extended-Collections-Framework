package yuu.akron.ucollection;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps.EntryTransformer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @param <K>
 * @param <V>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class HashMapWithUtility<K, V> extends HashMap<K, V> implements yuu.akron.ucollection.interfaces.another.Map<K, V> {

    public HashMapWithUtility(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public HashMapWithUtility() {
        super();
    }

    public HashMapWithUtility(int initialCapacity) {
        super(initialCapacity);
    }

    public HashMapWithUtility(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public static <K, V> yuu.akron.ucollection.another.HashMap<K, V> newMap() {
        return new yuu.akron.ucollection.another.HashMap<K, V>();
    }

    public static <K, V> yuu.akron.ucollection.another.HashMap<K, V> newMap(Map<? extends K, ? extends V> m) {
        return new yuu.akron.ucollection.another.HashMap<K, V>(m);
    }

    public static <K, V> yuu.akron.ucollection.another.HashMap<K, V> newMap(int initialCapacity) {
        return new yuu.akron.ucollection.another.HashMap<K, V>(initialCapacity);
    }

    public static <K, V> yuu.akron.ucollection.another.HashMap<K, V> newMap(int initialCapacity, float loadFactor) {
        return new yuu.akron.ucollection.another.HashMap<K, V>(initialCapacity, loadFactor);
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
    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right) {
        return Maps.difference(this, right);
    }

    @Override
    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right, Equivalence<? super V> valueEquivalence) {
        return Maps.difference(this, right, valueEquivalence);
    }

    @Override
    public yuu.akron.ucollection.another.HashMap<K, V> filterEntries(Predicate<? super Entry<K, V>> entryPredicate) {
        return new yuu.akron.ucollection.another.HashMap<K, V>(Maps.filterEntries(this, entryPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.HashMap<K, V> filterKeys(Predicate<? super K> keyPredicate) {
        return new yuu.akron.ucollection.another.HashMap<K, V>(Maps.filterKeys(this, keyPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.HashMap<K, V> filterValues(Predicate<? super V> valuePredicate) {
        return new yuu.akron.ucollection.another.HashMap<K, V>(Maps.filterValues(this, valuePredicate));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.HashMap<K, V2> transformEntries(EntryTransformer<? super K, ? super V, V2> transformer) {
        return new yuu.akron.ucollection.another.HashMap<K, V2>(Maps.transformEntries(this, transformer));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.HashMap<K, V2> transformValues(Function<? super V, V2> function) {
        return new yuu.akron.ucollection.another.HashMap<K, V2>(Maps.transformValues(this, function));
    }

    @Override
    public yuu.akron.ucollection.another.HashMap<K, V> clone() {
        return new yuu.akron.ucollection.another.HashMap<K, V>(this);
    }
}
