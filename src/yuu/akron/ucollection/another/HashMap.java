package yuu.akron.ucollection.another;

import java.util.Map;
import yuu.akron.ucollection.UHashMap;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 */
public class HashMap<K, V> extends UHashMap<K, V> {

    public HashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public HashMap() {
        super();
    }

    public HashMap(int initialCapacity) {
        super(initialCapacity);
    }

    public HashMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }
}
