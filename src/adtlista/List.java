
public interface List<T> {

    void addFirst(T value);

    void addLast(T value);

    T removeFirst();

    T removeLast();

    T getFirst();

    T getLast();

    boolean isEmpty();

    int size();
}