package yuu.akron.ucollection.another;

import java.util.Map;
import yuu.akron.ucollection.UEnumMap;

/**
 *
 * @param <K> 
 * @param <V> 
 * @author yuu@akron
 */
public class EnumMap<K extends Enum<K>, V> extends UEnumMap<K, V> {

    public EnumMap(Map<K, ? extends V> m) {
        super(m);
    }

    public EnumMap(java.util.EnumMap<K, ? extends V> m) {
        super(m);
    }

    public EnumMap(Class<K> keyType) {
        super(keyType);
    }
}
