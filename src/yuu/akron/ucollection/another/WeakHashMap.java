package yuu.akron.ucollection.another;

import java.util.Map;
import yuu.akron.ucollection.UWeakHashMap;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class WeakHashMap<K, V> extends UWeakHashMap<K, V> {

    public WeakHashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public WeakHashMap() {
        super();
    }

    public WeakHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    public WeakHashMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }
}
