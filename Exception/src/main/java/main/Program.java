package main;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        try{
            out.println("Digite um número double: ");
            double num1 = scanner.nextDouble();
        } catch (InputMismatchException e){
            out.println("Erro não é permitido número com pontos ao invés de virgula.");
        }

        scanner.close();
    }
}
