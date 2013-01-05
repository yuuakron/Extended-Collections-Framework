package yuu.akron.ucollection.another;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import yuu.akron.ucollection.UTreeMap;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class TreeMap<K, V> extends UTreeMap<K, V> {

    public TreeMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public TreeMap() {
        super();
    }

    public TreeMap(SortedMap<K, ? extends V> m) {
        super(m);
    }

    public TreeMap(Comparator<? super K> comparator) {
        super(comparator);
    }
}
