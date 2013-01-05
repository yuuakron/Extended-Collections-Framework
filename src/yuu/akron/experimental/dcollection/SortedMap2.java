/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.experimental.dcollection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

/**
 *
 * @author yuuakron
 */
interface SortedMap2<K, V> extends Map2<K, V> {

    public Comparator<? super K> comparator();

    public Set<Entry<K, V>> entrySet();

    public K firstKey();

    public SortedMap<K, V> headMap(K toKey);

    public Set<K> keySet();

    public K lastKey();

    public SortedMap<K, V> subMap(K fromKey, K toKey);

    public SortedMap<K, V> tailMap(K fromKey);

    public Collection<V> values();
}
