package yuu.akron.ucollection;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.rits.cloning.Cloner;
import java.io.IOException;
import java.io.Serializable;
import java.util.IdentityHashMap;
import java.util.Map;
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
public class IdentityHashMapWithUtility<K, V> extends IdentityHashMap<K, V> implements yuu.akron.ucollection.interfaces.another.Map<K, V> {

    public IdentityHashMapWithUtility(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public IdentityHashMapWithUtility(int expectedMaxSize) {
        super(expectedMaxSize);
    }

    public IdentityHashMapWithUtility() {
        super();
    }

    public static <K, V> IdentityHashMapWithUtility<K, V> newMap() {
        return new IdentityHashMapWithUtility<K, V>();
    }

    public static <K, V> IdentityHashMapWithUtility<K, V> newMap(int expectedMaxSize) {
        return new IdentityHashMapWithUtility<K, V>(expectedMaxSize);
    }

    public static <K, V> IdentityHashMapWithUtility<K, V> newMap(Map<? extends K, ? extends V> m) {
        return new IdentityHashMapWithUtility<K, V>(m);
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
    public yuu.akron.ucollection.another.IdentityHashMap<K, V> filterEntries(Predicate<? super Entry<K, V>> entryPredicate) {
        return new yuu.akron.ucollection.another.IdentityHashMap<K, V>(Maps.filterEntries(this, entryPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.IdentityHashMap<K, V> filterKeys(Predicate<? super K> keyPredicate) {
        return new yuu.akron.ucollection.another.IdentityHashMap<K, V>(Maps.filterKeys(this, keyPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.IdentityHashMap<K, V> filterValues(Predicate<? super V> valuePredicate) {
        return new yuu.akron.ucollection.another.IdentityHashMap<K, V>(Maps.filterValues(this, valuePredicate));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.IdentityHashMap<K, V2> transformEntries(Maps.EntryTransformer<? super K, ? super V, V2> transformer) {
        return new yuu.akron.ucollection.another.IdentityHashMap<K, V2>(Maps.transformEntries(this, transformer));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.IdentityHashMap<K, V2> transformValues(Function<? super V, V2> function) {
        return new yuu.akron.ucollection.another.IdentityHashMap<K, V2>(Maps.transformValues(this, function));
    }

    @Override
    public yuu.akron.ucollection.another.IdentityHashMap<K, V> clone() {
        return (yuu.akron.ucollection.another.IdentityHashMap<K, V>) super.clone();
    }

    @Override
    public yuu.akron.ucollection.another.IdentityHashMap<K, V> deepClone() {
        yuu.akron.ucollection.another.IdentityHashMap<K, V> map = new yuu.akron.ucollection.another.IdentityHashMap<K, V>();

        if (this.isEmpty()) {
            return map;
        }

        for (Map.Entry<K, V> item : this.entrySet()) {
            K key = item.getKey();
            V value = item.getValue();

            if (key instanceof DeepClonable) {
                key = (K) ((DeepClonable) key).deepClone();
            } else if (key instanceof Serializable) {
                try {
                    key = DeepCloneUtils.deepCopy(key);
                } catch (Exception e) {
                    key = DeepCloneUtils.deepCopyWithCloner(key);
                }
            } else {
                key = DeepCloneUtils.deepCopyWithCloner(key);
            }

            if (value instanceof DeepClonable) {
                value = (V) ((DeepClonable) value).deepClone();
            } else if (value instanceof Serializable) {
                try {
                    value = DeepCloneUtils.deepCopy(value);
                } catch (Exception e) {
                    value = DeepCloneUtils.deepCopyWithCloner(value);
                }
            } else {
                value = DeepCloneUtils.deepCopyWithCloner(value);
            }

            map.put(key, value);
        }

        return map;
    }
}
