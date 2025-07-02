import entities.Bank;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank cliente;

        System.out.println("Enter account number : ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter account holder : ");
        String name = scanner.nextLine();

        System.out.println("Is there initial deposit?(y/n)");
        Character opcao = scanner.next().charAt(0);

        if(opcao.equals('y')){
            System.out.println("Enter initial deposit value : ");
            double deposit = scanner.nextDouble();
            cliente = new Bank(numeroConta,name,deposit);

            System.out.println("Enter a deposit value");
            double deposit2 = scanner.nextDouble();
            cliente.depositar(deposit2);
            System.out.println(cliente.toString());
            System.out.println("Enter a withdraw value : ");
            double sacar = scanner.nextDouble();
            cliente.sacar(sacar);
            System.out.println(cliente.toString());
        }else{
            //Instanciando objeto Secundário
            cliente = new Bank(numeroConta,name);
            System.out.println("Enter a deposit value");
            double deposit2 = scanner.nextDouble();
            cliente.depositar(deposit2);
            System.out.println(cliente.toString());
            System.out.println("Enter a withdraw value : ");
            double sacar = scanner.nextDouble();
            cliente.sacar(sacar);
            System.out.println(cliente.toString());
        }




    }
}
