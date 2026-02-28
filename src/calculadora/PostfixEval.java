package calculadora;

import adtstack.Stack;
import adtstack.VectorStack;

public class PostfixEval {

    public static int evaluate(String postfix) {

        Stack<Integer> stack = new VectorStack<>();

        String[] tokens = postfix.split(" ");

        for (String token : tokens) {

            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {

                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }
}