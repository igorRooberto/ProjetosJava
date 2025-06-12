import java.util.Scanner;

public class numeroPrimo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número inteiro : ");
        int numero = scanner.nextInt();

        int i = 2;
        for( i = 2;i < numero ;i++) {
        }
            if(numero % i == 0){
                System.out.println("Esse número não é primo!");
            }else{
                System.out.println("Esse número é primo!");
           }







        scanner.close();
    }
}
