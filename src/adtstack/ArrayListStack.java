package adtstack;

import java.util.ArrayList;

public class ArrayListStack<T> extends AbstractStack<T> {

    private ArrayList<T> data;

    public ArrayListStack() {
        data = new ArrayList<>();
    }

    @Override
    public void push(T element) {
        data.add(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vacío");
        }
        return data.remove(data.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack vacío");
        }
        return data.get(data.size() - 1);
    }

    @Override
    public int size() {
        return data.size();
    }
}