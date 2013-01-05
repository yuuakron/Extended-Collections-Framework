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
public class ULinkedHashMap<K, V> extends LinkedHashMapWithUtility<K, V> {

    public ULinkedHashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    public ULinkedHashMap() {
        super();
    }

    public ULinkedHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    public ULinkedHashMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public ULinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }
}
