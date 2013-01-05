/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.experimental.dcollection;

import java.util.*;
import yuu.akron.ucollection.interfaces.NavigableMapWithUtility;
import yuu.akron.ucollection.interfaces.SortedMapWithUtility;

/**
 *
 * @author yuuakron
 */
public class DynamicNavigableMap<K, V> extends DynamicMap<K, V> implements NavigableMapWithUtility<K, V> {

    public static class Builder<K, V> {

        private Object collection;
        private Interfaces interfaces = Interfaces.Map;
        private Contents contents = Contents.Normal;

        public Builder() {
        }

        public DynamicMap<K, V> build() {

            collection = new TreeMap<K, V>();

            return new DynamicNavigableMap<K, V>(this);
        }
    }

    protected DynamicNavigableMap() {
    }

    private DynamicNavigableMap(DynamicNavigableMap.Builder<K, V> builder) {
        collection = builder.collection;
        interfaces = builder.interfaces;
        contents = builder.contents;
    }
    
    //conversion functions
    public SortedMap<K, V> toSortedMap() {
        if (collection instanceof SortedMap) {
            return (SortedMap<K, V>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableMap<K, V> toNavigableMap() {
        if (collection instanceof NavigableMap) {
            return (NavigableMap<K, V>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //for SortedMap
    public Comparator<? super K> comparator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public K firstKey() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public SortedMap<K, V> headMap(K toKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public K lastKey() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public SortedMap<K, V> subMap(K fromKey, K toKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public SortedMap<K, V> tailMap(K fromKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Utility from java.util.Collections
    public SortedMap<K, V> checkedSortedMap(Class<K> keyEype, Class<V> valueEype) {
        return Collections.checkedSortedMap((SortedMap<K, V>) collection, keyEype, valueEype);
    }

    public SortedMap<K, V> unmodifiableSortedMap() {
        return Collections.unmodifiableSortedMap((SortedMap<K, V>) collection);
    }

    public SortedMap<K, V> synchronizedSortedMap() {
        return Collections.synchronizedSortedMap((SortedMap<K, V>) collection);
    }

    
    //for NavigableMap
    public Entry<K, V> ceilingEntry(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public K ceilingKey(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableSet<K> descendingKeySet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableMap<K, V> descendingMap() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Entry<K, V> firstEntry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Entry<K, V> floorEntry(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public K floorKey(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Entry<K, V> higherEntry(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public K higherKey(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Entry<K, V> lastEntry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Entry<K, V> lowerEntry(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public K lowerKey(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableSet<K> navigableKeySet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
