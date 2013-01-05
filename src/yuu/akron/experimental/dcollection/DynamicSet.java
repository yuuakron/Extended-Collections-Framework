package yuu.akron.experimental.dcollection;
import com.google.common.collect.Sets.SetView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import yuu.akron.ucollection.interfaces.SetWithUtility;

/**
 *
 * @author yuuakron
 */
public class DynamicSet<E> extends DynamicCollection<E> implements SetWithUtility<E> {

    public static class Builder<E> {

        private Object collection;
        private Interfaces interfaces = Interfaces.Set;
        private Contents contents = Contents.Normal;

        public Builder() {
        }

        public DynamicSet<E> build() {

            collection = new HashSet<E>();

            return new DynamicSet<E>(this);
        }
    }

    protected DynamicSet() {
    }

    private DynamicSet(Builder<E> builder) {
        collection = builder.collection;
        interfaces = builder.interfaces;
        contents = builder.contents;
    }

    //conversion function
    public Set<E> toSet() {
        if (collection instanceof Set) {
            return (Set<E>)collection;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Utility from java.util.Collections
    public Set<E> checkedSet(Class<E> type) {
        return Collections.checkedSet((Set<E>) collection, type);
    }

    public Set<E> unmodifiableSet() {
        return Collections.unmodifiableSet((Set<E>) collection);
    }

    public Set<E> synchronizedSet() {
        return Collections.synchronizedSet((Set<E>) collection);
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

    @Override
    public SetView<E> difference(Set<?> set2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SetView<E> intersection(Set<?> set2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SetView<E> symmetricDifference(Set<? extends E> set2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SetView<E> union(Set<? extends E> set2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}