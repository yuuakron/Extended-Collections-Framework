package yuu.akron.experimental.dcollection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import yuu.akron.ucollection.interfaces.CollectionWithUtility;

/**
 *
 * @author yuuakron
 */
public abstract class DynamicCollection<E> extends DynamicCollectionBase implements CollectionWithUtility<E> {

    //Collection
    public boolean add(E e) {
        try {
            Method method = collection.getClass().getMethod("add", Object.class);
            return (Boolean) method.invoke(collection, e);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addAll(Collection<? extends E> c) {
        try {
            Method method = collection.getClass().getMethod("addAll", Collection.class);
            return (Boolean) method.invoke(collection, c);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void clear() {
        try {
            Method method = collection.getClass().getMethod("clear", null);
            method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean contains(Object o) {
        try {
            Method method = collection.getClass().getMethod("contains", Object.class);
            return (Boolean) method.invoke(collection, o);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean containsAll(Collection<?> c) {
        try {
            Method method = collection.getClass().getMethod("containsAll", Collection.class);
            return (Boolean) method.invoke(collection, c);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isEmpty() {
        try {
            Method method = collection.getClass().getMethod("isEmpty", null);
            return (Boolean) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterator<E> iterator() {
        try {
            Method method = collection.getClass().getMethod("iterator", null);
            return (Iterator<E>) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean remove(Object o) {
        try {
            Method method = collection.getClass().getMethod("remove", Object.class);
            return (Boolean) method.invoke(collection, o);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean removeAll(Collection<?> c) {
        try {
            Method method = collection.getClass().getMethod("removeAll", Collection.class);
            return (Boolean) method.invoke(collection, c);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean retainAll(Collection<?> c) {
        try {
            Method method = collection.getClass().getMethod("retainAll", Collection.class);
            return (Boolean) method.invoke(collection, c);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int size() {
        try {
            Method method = collection.getClass().getMethod("size", null);
            return (Integer) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object[] toArray() {
        try {
            Method method = collection.getClass().getMethod("toArray", null);
            return (Object[]) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public <T> T[] toArray(T[] a) {
        try {
            Method method = collection.getClass().getMethod("toArray", Object[].class);
            return (T[]) method.invoke(collection, a);
        } catch (Exception ex) {
            Logger.getLogger(DynamicCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Utility from java.util.Collections
    public boolean addAll(E... elements) {
        return Collections.addAll((Collection<? super E>) collection, elements);
    }

    public Collection<E> checkedCollection(Class<E> type) {
        return Collections.checkedCollection((Collection<E>) collection, type);
    }

    public boolean disjoint(Collection<?> c) {
        return Collections.disjoint((Collection<E>) collection, c);
    }

    public Enumeration<E> enumeration() {
        return Collections.enumeration((Collection<E>) collection);
    }

    public int frequency(Object o) {
        return Collections.frequency((Collection<E>) collection, o);
    }

    public <E extends Comparable<? super E>> E max() {
        return Collections.max((Collection<E>) collection);
    }

    public E max(Comparator<? super E> comp) {
        return Collections.max((Collection<E>) collection, comp);
    }

    public <E extends Comparable<? super E>> E min() {
        return Collections.min((Collection<E>) collection);
    }

    public E min(Comparator<? super E> comp) {
        return Collections.min((Collection<E>) collection, comp);
    }

    public Collection<E> synchronizedCollection() {
        return Collections.synchronizedCollection((Collection<E>) collection);
    }

    public Collection<E> unmodifiableCollection() {
        return Collections.unmodifiableCollection((Collection<E>) collection);
    }

    //conversion function
    public Collection<E> toCollection() {
        if (collection instanceof Collection) {
            return (Collection<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean all(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean any(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E find(Predicate<? super E> predicate, E defaultValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E find(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int indexOf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Iterable<? extends E> elementsToAdd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Iterator<? extends E> iterator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public yuu.akron.ucollection.interfaces.another.Collection<E> filter(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> yuu.akron.ucollection.interfaces.another.Collection<T> transform(Function<? super E, T> function) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
