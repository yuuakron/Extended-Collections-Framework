package yuu.akron.ucollection;

import java.util.Map;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 *
 *
 */
public class UHashMap<K, V> extends HashMapWithUtility<K, V> {

    public UHashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public UHashMap() {
        super();
    }

    public UHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    public UHashMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }
}
