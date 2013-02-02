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
