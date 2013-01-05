/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.experimental.dcollection;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/**
 *
 * @author yuuakron
 */
interface NavigableMap2<K,V> extends SortedMap2<K, V> {

    public Entry<K, V> ceilingEntry(K key);

    public K ceilingKey(K key);

    public NavigableSet<K> descendingKeySet();

    public NavigableMap<K, V> descendingMap();

    public Entry<K, V> firstEntry();

    public Entry<K, V> floorEntry(K key);

    public K floorKey(K key);

    public NavigableMap<K, V> headMap(K toKey, boolean inclusive);

    public SortedMap<K, V> headMap(K toKey);

    public Entry<K, V> higherEntry(K key);

    public K higherKey(K key);

    public Entry<K, V> lastEntry();

    public Entry<K, V> lowerEntry(K key);

    public K lowerKey(K key);

    public NavigableSet<K> navigableKeySet();

    public Entry<K, V> pollFirstEntry();

    public Entry<K, V> pollLastEntry();

    public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive);

    public SortedMap<K, V> subMap(K fromKey, K toKey);

    public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive);

    public SortedMap<K, V> tailMap(K fromKey);
    
}
