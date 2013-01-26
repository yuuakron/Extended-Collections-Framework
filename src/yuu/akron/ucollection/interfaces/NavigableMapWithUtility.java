package yuu.akron.ucollection.interfaces;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Map;
import java.util.NavigableMap;

/**
 *
 * @param <K>
 * @param <V>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface NavigableMapWithUtility<K, V> extends SortedMapWithUtility<K, V>, NavigableMap<K, V> {

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<K> descendingKeySet();

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> descendingMap();

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> headMap(K toKey);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> headMap(K toKey, boolean inclusive);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableSet<K> navigableKeySet();

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> subMap(K fromKey, K toKey);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> tailMap(K fromKey);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> tailMap(K fromKey, boolean inclusive);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> filterEntries(Predicate<? super Map.Entry<K, V>> entryPredicate);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> filterKeys(Predicate<? super K> keyPredicate);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> filterValues(Predicate<? super V> valuePredicate);

    @Override
    public <V2> yuu.akron.ucollection.interfaces.another.NavigableMap<K, V2> transformEntries(Maps.EntryTransformer<? super K, ? super V, V2> transformer);

    @Override
    public <V2> yuu.akron.ucollection.interfaces.another.NavigableMap<K, V2> transformValues(Function<? super V, V2> function);

    @Override
    public yuu.akron.ucollection.interfaces.another.NavigableMap<K, V> deepClone() throws IOException, ClassNotFoundException ;
}
