import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    @Test
    void agregarElemento() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(5);
        list.add(10);

        assertEquals(2, list.size());
    }

    @Test
    void eliminarElemento() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(5);
        list.add(10);
        list.remove(5);

        assertEquals(1, list.size());
    }
}