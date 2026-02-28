package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import calculadora.InfixPostfix;
import calculadora.PostfixEval;

public class Main {

    public static void main(String[] args) {

        String infix = "";

        try {
            File file = new File("datos.txt");
            Scanner scanner = new Scanner(file);

            if (scanner.hasNextLine()) {
                infix = scanner.nextLine();
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo datos.txt");
            return;
        }

        System.out.println("Expresion infix: " + infix);

        String postfix = InfixPostfix.convert(infix);
        System.out.println("Postfix: " + postfix);

        int result = PostfixEval.evaluate(postfix);
        System.out.println("Resultado: " + result);
    }
}