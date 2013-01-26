package yuu.akron.ucollection.interfaces;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;

/**
 *
 * @param <K>
 * @param <V>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public interface SortedMapWithUtility<K, V> extends MapWithUtility<K, V>, SortedMap<K, V> {

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedMap<K, V> headMap(K toKey);

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedMap<K, V> subMap(K fromKey, K toKey);

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedMap<K, V> tailMap(K fromKey);

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedMap<K, V> filterEntries(Predicate<? super Map.Entry<K, V>> entryPredicate);

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedMap<K, V> filterKeys(Predicate<? super K> keyPredicate);

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedMap<K, V> filterValues(Predicate<? super V> valuePredicate);

    @Override
    public <V2> yuu.akron.ucollection.interfaces.another.SortedMap<K, V2> transformEntries(Maps.EntryTransformer<? super K, ? super V, V2> transformer);

    @Override
    public <V2> yuu.akron.ucollection.interfaces.another.SortedMap<K, V2> transformValues(Function<? super V, V2> function);

    @Override
    public yuu.akron.ucollection.interfaces.another.SortedMap<K, V> deepClone() throws IOException, ClassNotFoundException ;
}
