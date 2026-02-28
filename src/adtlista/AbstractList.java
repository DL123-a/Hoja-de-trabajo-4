package adtlista;

public abstract class AbstractList<T> implements List<T> {

    protected int count;

    public AbstractList() {
        count = 0;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
}