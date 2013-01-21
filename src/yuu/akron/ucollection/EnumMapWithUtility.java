package yuu.akron.ucollection;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps.EntryTransformer;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @param <K>
 * @param <V>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class EnumMapWithUtility<K extends Enum<K>, V> extends EnumMap<K, V> implements yuu.akron.ucollection.interfaces.another.Map<K, V> {

    public EnumMapWithUtility(Map<K, ? extends V> m) {
        super(m);
    }

    public EnumMapWithUtility(EnumMap<K, ? extends V> m) {
        super(m);
    }

    public EnumMapWithUtility(Class<K> keyType) {
        super(keyType);
    }

    public static <K extends Enum<K>, V> yuu.akron.ucollection.another.EnumMap<K, V> newMap(Map<K, V> m) {
        return new yuu.akron.ucollection.another.EnumMap<K, V>(m);
    }

    public static <K extends Enum<K>, V> yuu.akron.ucollection.another.EnumMap<K, V> newMap(EnumMap<K, ? extends V> m) {
        return new yuu.akron.ucollection.another.EnumMap<K, V>(m);
    }

    public static <K extends Enum<K>, V> yuu.akron.ucollection.another.EnumMap<K, V> newMap(Class<K> keyType) {
        return new yuu.akron.ucollection.another.EnumMap<K, V>(keyType);
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
    public yuu.akron.ucollection.another.EnumMap<K, V> filterEntries(Predicate<? super Entry<K, V>> entryPredicate) {
        return new yuu.akron.ucollection.another.EnumMap<K, V>(Maps.filterEntries(this, entryPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.EnumMap<K, V> filterKeys(Predicate<? super K> keyPredicate) {
        return new yuu.akron.ucollection.another.EnumMap<K, V>(Maps.filterKeys(this, keyPredicate));
    }

    @Override
    public yuu.akron.ucollection.another.EnumMap<K, V> filterValues(Predicate<? super V> valuePredicate) {
        return new yuu.akron.ucollection.another.EnumMap<K, V>(Maps.filterValues(this, valuePredicate));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.EnumMap<K, V2> transformEntries(EntryTransformer<? super K, ? super V, V2> transformer) {
        return new yuu.akron.ucollection.another.EnumMap<K, V2>(Maps.transformEntries(this, transformer));
    }

    @Override
    public <V2> yuu.akron.ucollection.another.EnumMap<K, V2> transformValues(Function<? super V, V2> function) {
        return new yuu.akron.ucollection.another.EnumMap<K, V2>(Maps.transformValues(this, function));
    }

    @Override
    public yuu.akron.ucollection.another.EnumMap<K, V> clone() {
        return  new yuu.akron.ucollection.another.EnumMap<K, V>(this);
    } 
}
