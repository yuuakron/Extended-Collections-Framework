package yuu.akron.experimental.dcollection;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps.EntryTransformer;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yuuakron
 */
public class DynamicMap<K, V> extends DynamicCollectionBase implements yuu.akron.ucollection.interfaces.another.Map<K, V> {
        public static class Builder<K, V> {

        private Object collection;
        private Interfaces interfaces = Interfaces.Map;
        private Contents contents = Contents.Normal;

        public Builder() {
        }

        public DynamicMap<K, V> build() {

            collection = new HashMap<K, V>();

            return new DynamicMap<K, V>(this);
        }
    }

    protected DynamicMap() {
    }

    private DynamicMap(DynamicMap.Builder<K, V> builder) {
        collection = builder.collection;
        interfaces = builder.interfaces;
        contents = builder.contents;
    }

    //conversion map
    public Map<K, V> toMap() {
        if (collection instanceof Map) {
            return (Map<K, V>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //for Map
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public V get(Object key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public V put(K key, V value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public V remove(Object key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Utility from java.util.Collections
    public Map<K, V> checkedMap(Class<K> keyEype, Class<V> valueEype) {
        return Collections.checkedMap((Map<K, V>) collection, keyEype, valueEype);
    }

    public Map<K, V> synchronizedMap() {
        return Collections.synchronizedMap((Map<K, V>) collection);
    }

    public Map<K, V> unmodifiableMap() {
        return Collections.unmodifiableMap((Map<K, V>) collection);
    }

    public void checked(Class<K> keyEype, Class<V> valueEype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void synchronize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void unmodifiable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public MapDifference<K, V> difference(Map<? extends K, ? extends V> right, Equivalence<? super V> valueEquivalence) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Map<K, V> filterEntries(Predicate<? super Entry<K, V>> entryPredicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Map<K, V> filterKeys(Predicate<? super K> keyPredicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Map<K, V> filterValues(Predicate<? super V> valuePredicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <V2> yuu.akron.ucollection.interfaces.another.Map<K, V2> transformEntries(EntryTransformer<? super K, ? super V, V2> transformer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <V2> yuu.akron.ucollection.interfaces.another.Map<K, V2> transformValues(Function<? super V, V2> function) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Map<K, V> deepClone(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Set<K> keySet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Collection<V> values() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
