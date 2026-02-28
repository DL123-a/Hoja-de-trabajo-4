package main;

import adtstack.Stack;
import adtstack.VectorStack;
import calculadora.InfixPostfix;
import calculadora.PostfixEval;

public class Main {

    public static void main(String[] args) {

        // Crear stack manualmente (por ahora fijo)
        Stack<Integer> testStack = new VectorStack<>();

        testStack.push(10);
        testStack.push(20);

        System.out.println("Prueba Stack pop: " + testStack.pop());

        // Expresion de prueba
        String infix = "(10+20)*9";

        // Convertir a postfix
        String postfix = InfixPostfix.convert(infix);
        System.out.println("Postfix: " + postfix);

        // Evaluar postfix
        int result = PostfixEval.evaluate(postfix);
        System.out.println("Resultado: " + result);
    }
}