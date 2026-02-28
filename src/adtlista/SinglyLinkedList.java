package adtlista;

public class SinglyLinkedList<T> extends AbstractList<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    @Override
    public void addFirst(T value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        count++;
    }

    @Override
    public void addLast(T value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }

        T value = head.data;
        head = head.next;
        count--;
        return value;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }

        if (head.next == null) {
            T value = head.data;
            head = null;
            count--;
            return value;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        T value = temp.next.data;
        temp.next = null;
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

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.data;
    }
}