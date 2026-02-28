package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PostfixEvalTest {

    @Test
    void evaluarSumaSimple() {
        PostfixEval evaluator = new PostfixEval();
        double resultado = evaluator.evaluate("3 4 +");
        assertEquals(7.0, resultado);
    }

    @Test
    void evaluarExpresionCompleja() {
        PostfixEval evaluator = new PostfixEval();
        double resultado = evaluator.evaluate("5 1 2 + 4 * + 3 -");
        assertEquals(14.0, resultado);
    }

    @Test
    void evaluarDivision() {
        PostfixEval evaluator = new PostfixEval();
        double resultado = evaluator.evaluate("10 2 /");
        assertEquals(5.0, resultado);
    }
}