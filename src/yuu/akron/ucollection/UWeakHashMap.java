package yuu.akron.ucollection;

import java.util.Map;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class UWeakHashMap<K, V> extends WeakHashMapWithUtility<K, V> {

    private static final long serialVersionUID = 1L;

    public UWeakHashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public UWeakHashMap() {
        super();
    }

    public UWeakHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    public UWeakHashMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }
}
