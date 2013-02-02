package yuu.akron.ucollection;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.rits.cloning.Cloner;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashMap;
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
public class LinkedHashMapWithUtility<K, V> extends LinkedHashMap<K, V> implements yuu.akron.ucollection.interfaces.another.Map<K, V> {

    public LinkedHashMapWithUtility(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public LinkedHashMapWithUtility() {
        super();
    }

    public LinkedHashMapWithUtility(int initialCapacity) {
        super(initialCapacity);
    }

    public LinkedHashMapWithUtility(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public LinkedHashMapWithUtility(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    public static <K, V> LinkedHashMapWithUtility<K, V> newMap() {
        return new LinkedHashMapWithUtility<K, V>();
    }

    public static <K, V> LinkedHashMapWithUtility<K, V> newMap(Map<? extends K, ? extends V> m) {
        return new LinkedHashMapWithUtility<K, V>(m);
    }

    public static <K, V> LinkedHashMapWithUtility<K, V> newMap(int initialCapacity) {
        return new LinkedHashMapWithUtility<K, V>(initialCapacity);
    }

    public static <K, V> LinkedHashMapWithUtility<K, V> newMap(int initialCapacity, float loadFactor) {
        return new LinkedHashMapWithUtility<K, V>(initialCapacity, loadFactor);
    }

    public static <K, V> LinkedHashMapWithUtility<K, V> newMap(int initialCapacity, float loadFactor, boolean accessOrder) {
        return new LinkedHashMapWithUtility<K, V>(initialCapacity, loadFactor, accessOrder);
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
    public yuu.akron.ucollection.interfaces.another.Set<Map.Entry<K, V>> entrySet() {
        return new HashSetWithUtility<Map.Entry<K, V>>(super.entrySet());
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
    public yuu.akron.ucollection.another.LinkedHashMap<K, V> filterEntries(Predicate<? super Entry<K, V>> entryPredicate) {
        return new yuu.akron.ucollection.another.LinkedHashMap<K, V>(Maps.filterEntries(this, entryPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.LinkedHashMap<K, V> filterKeys(Predicate<? super K> keyPredicate) {
        return new yuu.akron.ucollection.another.LinkedHashMap<K, V>(Maps.filterKeys(this, keyPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.LinkedHashMap<K, V> filterValues(Predicate<? super V> valuePredicate) {
        return new yuu.akron.ucollection.another.LinkedHashMap<K, V>(Maps.filterValues(this, valuePredicate));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.LinkedHashMap<K, V2> transformEntries(Maps.EntryTransformer<? super K, ? super V, V2> transformer) {
        return new yuu.akron.ucollection.another.LinkedHashMap<K, V2>(Maps.transformEntries(this, transformer));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.LinkedHashMap<K, V2> transformValues(Function<? super V, V2> function) {
        return new yuu.akron.ucollection.another.LinkedHashMap<K, V2>(Maps.transformValues(this, function));
    }

    @Override
    public yuu.akron.ucollection.another.LinkedHashMap<K, V> clone() {
        return (yuu.akron.ucollection.another.LinkedHashMap<K, V>)super.clone();
    }
    
        @Override
    public yuu.akron.ucollection.another.LinkedHashMap<K, V> deepClone() throws IOException, ClassNotFoundException {
        yuu.akron.ucollection.another.LinkedHashMap<K, V> map = new yuu.akron.ucollection.another.LinkedHashMap<K, V>();

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
