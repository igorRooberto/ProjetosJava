import java.util.Scanner;

public class NumeroContar{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        System.out.println("Digite um número : ");
        int numero = scanner.nextInt();

        while(numero != 0){

            numero = numero / 10;

            contador++;
        }

        System.out.println("O número de dígitos = "+contador);

        scanner.close();
    }
}
