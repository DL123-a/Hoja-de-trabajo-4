package adtstack;

import adtlista.List;

public class ListStack<T> extends AbstractStack<T> {

    private List<T> list;

    public ListStack(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("La lista no puede ser null");
        }
        this.list = list;
    }

    @Override
    public void push(T element) {
        if (element == null) {
            throw new IllegalArgumentException("El elemento no puede ser null");
        }
        list.addFirst(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila esta vacia");
        }
        return list.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila esta vacia");
        }
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.size();
    }
}