package yuu.akron.ucollection.another;

import java.util.Map;
import yuu.akron.ucollection.UIdentityHashMap;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class IdentityHashMap<K, V> extends UIdentityHashMap<K, V> {

    public IdentityHashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public IdentityHashMap(int expectedMaxSize) {
        super(expectedMaxSize);
    }

    public IdentityHashMap() {
        super();
    }
}
