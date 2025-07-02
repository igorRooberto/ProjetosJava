import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números você irá digitar : ");
        int numero = scanner.nextInt();

        int[] vetor = new int[numero];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número : ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("NÚMEROS NEGATIVOS");

        for(int i = 0; i < vetor.length;i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }
        scanner.close();
    }
}
