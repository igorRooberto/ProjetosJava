import util.CurrencyConverter;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dolar = scanner.nextDouble();

        System.out.println("How many dollars will be bought?");
        double dollarTotal = scanner.nextDouble();

        System.out.format("Amount to be paid in reais = %.2f ",CurrencyConverter.totalReal(dolar, dollarTotal));

    }
}
