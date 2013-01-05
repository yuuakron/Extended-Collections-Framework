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
public class UIdentityHashMap<K, V> extends IdentityHashMapWithUtility<K, V> {

    public UIdentityHashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public UIdentityHashMap(int expectedMaxSize) {
        super(expectedMaxSize);
    }

    public UIdentityHashMap() {
        super();
    }
}
