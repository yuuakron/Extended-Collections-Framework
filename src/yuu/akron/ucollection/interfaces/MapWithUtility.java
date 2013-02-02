package yuu.akron.ucollection.interfaces;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Map;
import yuu.akron.ulang.DeepClonable;

/**
 *
 * @param <K>
 * @param <V>
 * @author yuu@akron
 */
public interface MapWithUtility<K, V> extends Map<K, V>, DeepClonable {

    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right);

    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right, Equivalence<? super V> valueEquivalence);

    public yuu.akron.ucollection.interfaces.another.Map<K, V> filterEntries(Predicate<? super Map.Entry<K, V>> entryPredicate);

    public yuu.akron.ucollection.interfaces.another.Map<K, V> filterKeys(Predicate<? super K> keyPredicate);

    public yuu.akron.ucollection.interfaces.another.Map<K, V> filterValues(Predicate<? super V> valuePredicate);

    public <V2> yuu.akron.ucollection.interfaces.another.Map<K, V2> transformEntries(Maps.EntryTransformer<? super K, ? super V, V2> transformer);

    public <V2> yuu.akron.ucollection.interfaces.another.Map<K, V2> transformValues(Function<? super V, V2> function);

    @Override
    public yuu.akron.ucollection.interfaces.another.Set<Map.Entry<K, V>> entrySet();

    @Override
    public yuu.akron.ucollection.interfaces.another.Set<K> keySet();

    @Override
    public yuu.akron.ucollection.interfaces.another.Collection<V> values();

    @Override
    public yuu.akron.ucollection.interfaces.another.Map<K, V> deepClone() throws IOException, ClassNotFoundException ;
}
