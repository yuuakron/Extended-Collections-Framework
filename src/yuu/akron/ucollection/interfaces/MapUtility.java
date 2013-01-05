package yuu.akron.ucollection.interfaces;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import java.util.Map;

/**
 *
 * @param <K>
 * @param <V>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
interface MapUtility<K, V> {

    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right);

    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right, Equivalence<? super V> valueEquivalence);

    public yuu.akron.ucollection.interfaces.another.Map<K, V> filterEntries(Predicate<? super Map.Entry<K, V>> entryPredicate);

    public yuu.akron.ucollection.interfaces.another.Map<K, V> filterKeys(Predicate<? super K> keyPredicate);

    public yuu.akron.ucollection.interfaces.another.Map<K, V> filterValues(Predicate<? super V> valuePredicate);

    public <V2> yuu.akron.ucollection.interfaces.another.Map<K, V2> transformEntries(Maps.EntryTransformer<? super K, ? super V, V2> transformer);

    public <V2> yuu.akron.ucollection.interfaces.another.Map<K, V2> transformValues(Function<? super V, V2> function);
}
