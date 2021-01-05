package lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CollectionsUtilsImpl implements CollectionUtils {

    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }


    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);
        result.retainAll(a);
        result.retainAll(b);
        return result;
    }


    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }


    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>(a);
        result.retainAll(b);
        return result;

    }


    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);
        result.removeAll(intersection(a,b));
        return result;
    }
}
