package yuu.akron.experimental.dcollection;

import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import yuu.akron.ucollection.interfaces.ListWithUtility;

/**
 *
 * @author yuuakron
 */
public class DynamicList<E> extends DynamicCollection<E> implements ListWithUtility<E> {

    public static class Builder<E> {

        private Object collection;
        private Interfaces interfaces = Interfaces.List;
        private Contents contents = Contents.Normal;

        public Builder() {
        }

        public DynamicList<E> build() {
            collection = new ArrayList<E>();
            return new DynamicList<E>(this);
        }
    }

    private DynamicList() {
    }

    private DynamicList(Builder<E> builder) {
        this.collection = builder.collection;
        this.interfaces = builder.interfaces;
        this.contents = builder.contents;
    }

    //List
    public void add(int index, E element) {
        try {
            Method method = collection.getClass().getMethod("add", int.class, Object.class);
            method.invoke(collection, index, element);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        try {
            Method method = collection.getClass().getMethod("addAll", int.class, Collection.class);
            return (Boolean) method.invoke(collection, index, c);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E get(int index) {
        try {
            Method method = collection.getClass().getMethod("get", int.class);
            return (E) method.invoke(collection, index);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int indexOf(Object o) {
        try {
            Method method = collection.getClass().getMethod("indexOf", Object.class);
            return (Integer) method.invoke(collection, o);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int lastIndexOf(Object o) {
        try {
            Method method = collection.getClass().getMethod("lastIndexOf", Object.class);
            return (Integer) method.invoke(collection, o);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ListIterator<E> listIterator() {
        try {
            Method method = collection.getClass().getMethod("listIterator", null);
            return (ListIterator<E>) method.invoke(collection, null);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ListIterator<E> listIterator(int index) {
        try {
            Method method = collection.getClass().getMethod("listIterator", int.class);
            return (ListIterator<E>) method.invoke(collection, index);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E remove(int index) {
        try {
            Method method = collection.getClass().getMethod("remove", int.class);
            return (E) method.invoke(collection, index);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E set(int index, E element) {
        try {
            Method method = collection.getClass().getMethod("set", int.class, Object.class);
            return (E) method.invoke(collection, index, element);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<E> subList(int fromIndex, int toIndex) {
        try {
            Method method = collection.getClass().getMethod("subList", int.class, int.class);
            return (List<E>) method.invoke(collection, fromIndex, toIndex);
        } catch (Exception ex) {
            Logger.getLogger(DynamicList.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Utility from java.util.Collections
    public <E extends Comparable<? super E>> int binarySearch(E key) {
        return Collections.binarySearch((List<E>) collection, key);
    }

    public int binarySearch(E key, Comparator<? super E> c) {
        return Collections.binarySearch((List<E>) collection, key, c);
    }

    public List<E> checkedList(Class<E> type) {
        return Collections.checkedList((List<E>) collection, type);
    }

    public void copy(List<? super E> dest) {
        Collections.copy(dest, (List<E>) collection);
    }

    public void fill(E obj) {
        Collections.fill((List<E>) collection, obj);
    }

    public int indexOfSubList(List<?> target) {
        return Collections.indexOfSubList((List<E>) collection, target);
    }

    public int lastIndexOfSubList(List<?> target) {
        return Collections.lastIndexOfSubList((List<E>) collection, target);
    }

    public boolean replaceAll(E oldVal, E newVal) {
        return Collections.replaceAll((List<E>) collection, oldVal, newVal);
    }

    public void reverse() {
        Collections.reverse((List<E>) collection);
    }

    public void rotate(int distance) {
        Collections.rotate((List<E>) collection, distance);
    }

    public void shuffle() {
        Collections.shuffle((List<E>) collection);
    }

    public void shuffle(Random rnd) {
        Collections.shuffle((List<E>) collection, rnd);
    }

    public <E extends Comparable<? super E>> void sort() {
        Collections.sort((List<E>) collection);
    }

    public void sort(Comparator<? super E> c) {
        Collections.sort((List<E>) collection, c);
    }

    public void swap(int i, int j) {
        Collections.swap((List<E>) collection, i, j);
    }

    public List<E> synchronizedList() {
        return Collections.synchronizedList((List<E>) collection);
    }

    public List<E> unmodifiableList() {
        return Collections.unmodifiableList((List<E>) collection);
    }

    //conversion function
    public List<E> toList() {
        if (collection instanceof List) {
            return (List<E>) collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void checked(Class<E> type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void synchronize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void unmodifiable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
