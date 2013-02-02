package yuu.akron.ucollection.another;

import java.util.Map;
import yuu.akron.ucollection.ULinkedHashMap;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 *
 *
 */
public class LinkedHashMap<K, V> extends ULinkedHashMap<K, V> {

    public LinkedHashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public LinkedHashMap() {
        super();
    }

    public LinkedHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    public LinkedHashMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }
}
