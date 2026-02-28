package adtstack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayListStackTest {

    @Test
    void pushYPopFunciona() {
        ArrayListStack<Integer> stack = new ArrayListStack<>();
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void peekFunciona() {
        ArrayListStack<Integer> stack = new ArrayListStack<>();
        stack.push(100);

        assertEquals(100, stack.peek());
    }

    @Test
    void stackVacio() {
        ArrayListStack<Integer> stack = new ArrayListStack<>();
        assertTrue(stack.isEmpty());
    }
}