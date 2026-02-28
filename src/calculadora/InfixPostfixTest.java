package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InfixPostfixTest {

    @Test
    void convertirExpresionSimple() {
        InfixPostfix converter = new InfixPostfix();
        String resultado = converter.convert("3+4");
        assertEquals("3 4 +", resultado);
    }

    @Test
    void convertirConParentesis() {
        InfixPostfix converter = new InfixPostfix();
        String resultado = converter.convert("(3+4)*5");
        assertEquals("3 4 + 5 *", resultado);
    }
}