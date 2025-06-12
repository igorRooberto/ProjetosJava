import java.util.Scanner;

public class FatorialFor {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro : ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for(int i = numero; i > 1; i--){

             fatorial *= i;
        }

        System.out.println("o fatorial de "+numero+" é igual a = "+fatorial);

        scanner.close();
    }

}
