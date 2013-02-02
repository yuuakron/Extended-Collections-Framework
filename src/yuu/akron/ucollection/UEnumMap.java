package yuu.akron.ucollection;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 *
 *
 */
public class UEnumMap<K extends Enum<K>, V> extends EnumMapWithUtility<K, V> {

    public UEnumMap(Map<K, ? extends V> m) {
        super(m);
    }

    public UEnumMap(EnumMap<K, ? extends V> m) {
        super(m);
    }

    public UEnumMap(Class<K> keyType) {
        super(keyType);
    }
}
