package yuu.akron.ucollection;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 *
 *
 */
public class UTreeMap<K, V> extends TreeMapWithUtility<K, V> {

    public UTreeMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public UTreeMap() {
        super();
    }

    public UTreeMap(SortedMap<K, ? extends V> m) {
        super(m);
    }

    public UTreeMap(Comparator<? super K> comparator) {
        super(comparator);
    }
}
