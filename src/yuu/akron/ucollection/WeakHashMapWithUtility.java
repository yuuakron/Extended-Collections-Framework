package yuu.akron.ucollection;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.rits.cloning.Cloner;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import yuu.akron.ulang.DeepClonable;
import yuu.akron.ulang.DeepCloneUtils;

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
    public yuu.akron.ucollection.another.WeakHashMap<K, V> clone() {
        try {
            return (yuu.akron.ucollection.another.WeakHashMap<K, V>)super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(WeakHashMapWithUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public yuu.akron.ucollection.another.WeakHashMap<K, V> deepClone() throws IOException, ClassNotFoundException {
        yuu.akron.ucollection.another.WeakHashMap<K, V> map = new yuu.akron.ucollection.another.WeakHashMap<K, V>();

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
