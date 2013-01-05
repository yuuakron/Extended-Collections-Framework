package yuu.akron.experimental.fcollection;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @param <E>
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class ImmutableArrayList<E> extends AbstractImmutableList<E> implements Serializable, Cloneable, RandomAccess {

    private static final long serialVersionUID = 1L;
    private final ArrayList<E> list;

    public ImmutableArrayList() {
        list = new ArrayList<E>();
    }

    public ImmutableArrayList(int initialCapacity) {
        list = new ArrayList<E>(initialCapacity);
    }

    public ImmutableArrayList(E... elements) {
        list = new ArrayList<E>(Arrays.asList(elements));
    }

    public ImmutableArrayList(FunctionalCollection<? extends E> c) {
        list = new ArrayList<E>(FunctionalCollections.toCollection(c));
    }

    private ImmutableArrayList(Collection<? extends E> c) {
        list = new ArrayList<E>(c);
    }
    
    @Override
    protected List<E> list() {
        return (List<E>) list.clone();
    }

    @Override
    public ImmutableArrayList<E> retainAll(FunctionalCollection<?> c) {
        List<E> newlist = list();
        newlist.retainAll(FunctionalCollections.toCollection(c));
        return new ImmutableArrayList<E>(newlist);
    }

    @Override
    public ImmutableArrayList<E> removeAll(FunctionalCollection<?> c) {
        List<E> newlist = list();
        newlist.removeAll(FunctionalCollections.toCollection(c));
        return new ImmutableArrayList<E>(newlist);
    }

    @Override
    public ImmutableArrayList<E> subList(int fromIndex, int toIndex) {
        List<E> newlist = list();
        return new ImmutableArrayList<E>(newlist.subList(fromIndex, toIndex));
    }

    //要検討
    public ImmutableArrayList<E> trimToSize() {
        ArrayList<E> newlist = (ArrayList<E>) list();
        newlist.trimToSize();
        return new ImmutableArrayList<E>(newlist);
    }

    //java.util.setの返値を一時的にbufferに格納する。
    @Override
    public ImmutableArrayList<E> set(int index, E element) {
        List<E> newlist = list();
        E buff = newlist.set(index, element);
        ImmutableArrayList<E> ilist = new ImmutableArrayList<E>(newlist);
        ilist.buffer = buff;
        return ilist;
    }

    @Override
    public ImmutableArrayList<E> remove(E o) {
        List<E> newlist = list();
        newlist.remove(o);
        return new ImmutableArrayList<E>(newlist);
    }

    //java.util.removeの返値を一時的にbufferに格納する。
    @Override
    public ImmutableArrayList<E> remove(int index) {
        List<E> newlist = list();
        E buff = newlist.remove(index);
        ImmutableArrayList<E> ilist = new ImmutableArrayList<E>(newlist);
        ilist.buffer = buff;
        return ilist;
    }

    //要検討
    public ImmutableArrayList<E> ensureCapacity(int minCapacity) {
        ArrayList<E> newlist = (ArrayList<E>) list();
        newlist.ensureCapacity(minCapacity);
        return new ImmutableArrayList<E>(newlist);
    }

    @Override
    public ImmutableArrayList<E> clear() {
        List<E> newlist = list();
        newlist.clear();
        return new ImmutableArrayList<E>(newlist);
    }

    @Override
    public ImmutableArrayList<E> addAll(int index, FunctionalCollection<? extends E> c) {
        List<E> newlist = list();
        newlist.addAll(index, FunctionalCollections.toCollection(c));
        return new ImmutableArrayList<E>(newlist);
    }

    @Override
    public ImmutableArrayList<E> addAll(FunctionalCollection<? extends E> c) {
        List<E> newlist = list();
        newlist.addAll(FunctionalCollections.toCollection(c));
        return new ImmutableArrayList<E>(newlist);
    }

    @Override
    public ImmutableArrayList<E> add(int index, E element) {
        List<E> newlist = list();
        newlist.add(index, element);
        return new ImmutableArrayList<E>(newlist);
    }

    @Override
    public ImmutableArrayList<E> add(E e) {
        List<E> newlist = list();
        newlist.add(e);
        return new ImmutableArrayList<E>(newlist);
    }

    @Override
    protected ImmutableArrayList<E> clone() {
        return new ImmutableArrayList<E>(list);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ImmutableArrayList<E> other = (ImmutableArrayList<E>) obj;
        if (this.list != other.list && (this.list == null || !this.list.equals(other.list))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.list != null ? this.list.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ImmutableArrayList{" + "list=" + list + '}';
    }

    public static void main(String[] args) {
        FunctionalList<String> list0 = new ImmutableArrayList<String>("a");
        FunctionalList<String> list1 = list0.add("b");

        System.out.println(list0);
        System.out.println(list1);
        
        FunctionalList<String> list3 = list0.set(0, "z");
        System.out.println(list0);
        System.out.println(list3);
        System.out.println(list0.buffer());
        System.out.println(list3.buffer());
    }
}
