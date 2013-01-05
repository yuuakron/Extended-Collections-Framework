/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.experimental.dcollection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author yuuakron
 */
interface Map2<K, V>{

    public void clear();
    public boolean containsKey(Object key);
    public boolean containsValue(Object value);
    public Set<Entry<K, V>> entrySet();
    public V get(Object key);
    public boolean isEmpty();
    public Set<K> keySet();
    public V put(K key, V value);
    public void putAll(Map<? extends K, ? extends V> m);
    public V removeM(Object key);
    public int size();
    public Collection<V> values();
    
}

