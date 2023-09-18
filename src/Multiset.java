public interface Multiset {
    boolean add(Object item);
    void remove(Object item);
    boolean contains(Object item);
    boolean isEmpty(Object item);
    int count(Object item);
    int size();
}


