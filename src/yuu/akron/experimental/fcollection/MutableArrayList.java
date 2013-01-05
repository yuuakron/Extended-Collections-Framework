package yuu.akron.experimental.fcollection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/**
 *
 * @param <E>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class MutableArrayList<E> extends AbstractMutableList<E> implements Serializable, Cloneable, RandomAccess {

    private static final long serialVersionUID = 1L;
    private ArrayList<E> list;

    public MutableArrayList() {
        list = new ArrayList<E>();
    }

    public MutableArrayList(int initialCapacity) {
        list = new ArrayList<E>(initialCapacity);
    }

    public MutableArrayList(E... elements) {
        list = new ArrayList<E>(Arrays.asList(elements));
    }

    public MutableArrayList(FunctionalCollection<? extends E> c) {
        list = new ArrayList<E>(FunctionalCollections.toCollection(c));
    }

    @Override
    protected List<E> list(){
        return list;
    }
    
    @Override
    protected void setList(List<E> l){
        list = new ArrayList<E>(l);
    }
    
    @Override
    public MutableArrayList<E> retainAll(FunctionalCollection<?> c) {
        changedflag = list.retainAll(FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public MutableArrayList<E> removeAll(FunctionalCollection<?> c) {
        changedflag = list.removeAll(FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public MutableArrayList<E> subList(int fromIndex, int toIndex) {
        list = new ArrayList<E>(list.subList(fromIndex, toIndex));
        changedflag = true;
        return this;
    }

    public MutableArrayList<E> trimToSize() {
        list.trimToSize();
        changedflag = false;
        return this;
    }

    //java.util.setの返値を一時的にbufferに格納する。
    @Override
    public MutableArrayList<E> set(int index, E element) {
        buffer = list.set(index, element);
        changedflag = true;
        return this;
    }

    @Override
    public MutableArrayList<E> remove(E o) {
        changedflag = list.remove(o);
        return this;
    }

    //java.util.removeの返値を一時的にbufferに格納する。
    @Override
    public MutableArrayList<E> remove(int index) {
        buffer = list.remove(index);
        changedflag = true;
        return this;
    }

    public MutableArrayList<E> ensureCapacity(int minCapacity) {
        list.ensureCapacity(minCapacity);
        changedflag = false;
        return this;
    }

    @Override
    public MutableArrayList<E> clear() {
        if (list.isEmpty()) {
            changedflag = false;
        } else {
            changedflag = true;
        }
        list.clear();
        return this;
    }

    @Override
    public MutableArrayList<E> addAll(int index, FunctionalCollection<? extends E> c) {
        changedflag = list.addAll(index, FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public MutableArrayList<E> addAll(FunctionalCollection<? extends E> c) {
        changedflag = list.addAll(FunctionalCollections.toCollection(c));
        return this;
    }

    @Override
    public MutableArrayList<E> add(int index, E element) {
        list.add(index, element);
        changedflag = true;
        return this;
    }

    @Override
    public MutableArrayList<E> add(E e) {
        changedflag = list.add(e);
        return this;
    }

    @Override
    protected MutableArrayList<E> clone() {
        changedflag = false;
        return new MutableArrayList<E>(this);
    }

    @Override
    public boolean equals(Object obj) {
        changedflag = false;
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MutableArrayList<E> other = (MutableArrayList<E>) obj;
        if (this.list != other.list && (this.list == null || !this.list.equals(other.list))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        changedflag = false;
        int hash = 5;
        hash = 79 * hash + (this.list != null ? this.list.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        changedflag = false;
        return "MutableArrayList{" + "list=" + list + ", changedflag=" + changedflag + '}';
    }
    /*
    public static void main(String[] args){
        FunctionalList<String> list0 = new MutableArrayList<String>("a");
        FunctionalList<String> list1 = list0.add("b");
        
        System.out.println(list0);
        System.out.println(list1);
    }*/
}
