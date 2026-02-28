
public class DoublyLinkedList<T> extends AbstractList<T> {

    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(T value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        count++;
    }

    @Override
    public void addLast(T value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        count++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }

        T value = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        count--;
        return value;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }

        T value = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        count--;
        return value;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.data;
    }
}