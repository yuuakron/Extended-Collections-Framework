package yuu.akron.ucollection;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/**
 *
 * @param <K>
 * @param <V>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class WeakHashMapWithUtility<K, V> extends WeakHashMap<K, V> implements yuu.akron.ucollection.interfaces.another.Map<K, V> {

    public WeakHashMapWithUtility(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public WeakHashMapWithUtility() {
        super();
    }

    public WeakHashMapWithUtility(int initialCapacity) {
        super(initialCapacity);
    }

    public WeakHashMapWithUtility(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public static <K, V> WeakHashMapWithUtility<K, V> newMap() {
        return new WeakHashMapWithUtility<K, V>();
    }

    public static <K, V> WeakHashMapWithUtility<K, V> newMap(Map<? extends K, ? extends V> m) {
        return new WeakHashMapWithUtility<K, V>(m);
    }

    public static <K, V> WeakHashMapWithUtility<K, V> newMap(int initialCapacity) {
        return new WeakHashMapWithUtility<K, V>(initialCapacity);
    }

    public static <K, V> WeakHashMapWithUtility<K, V> newMap(int initialCapacity, float loadFactor) {
        return new WeakHashMapWithUtility<K, V>(initialCapacity, loadFactor);
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
    public yuu.akron.ucollection.another.WeakHashMap<K, V> filterEntries(Predicate<? super Entry<K, V>> entryPredicate) {
        return new yuu.akron.ucollection.another.WeakHashMap<K, V>(Maps.filterEntries(this, entryPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.WeakHashMap<K, V> filterKeys(Predicate<? super K> keyPredicate) {
        return new yuu.akron.ucollection.another.WeakHashMap<K, V>(Maps.filterKeys(this, keyPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.WeakHashMap<K, V> filterValues(Predicate<? super V> valuePredicate) {
        return new yuu.akron.ucollection.another.WeakHashMap<K, V>(Maps.filterValues(this, valuePredicate));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.WeakHashMap<K, V2> transformEntries(Maps.EntryTransformer<? super K, ? super V, V2> transformer) {
        return new yuu.akron.ucollection.another.WeakHashMap<K, V2>(Maps.transformEntries(this, transformer));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.WeakHashMap<K, V2> transformValues(Function<? super V, V2> function) {
        return new yuu.akron.ucollection.another.WeakHashMap<K, V2>(Maps.transformValues(this, function));
    }

    @Override
    public WeakHashMapWithUtility<K, V> clone() {
        return new WeakHashMapWithUtility<K, V>(this);
    }
}
