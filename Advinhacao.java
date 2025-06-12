import java.util.Scanner;
import java.util.Random;

public class Advinhacao {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Obter o número aleatório de 1 a 100
        int numeroSecreto = random.nextInt(100) +1;

        int palpite = 0;
        int tentativas = 0;

        while(palpite != numeroSecreto){

            System.out.println("Digite o seu palpite : ");
            palpite = scanner.nextInt();

            tentativas++;

            if(palpite < numeroSecreto){
                System.out.println("o número é maior,Tente Novamente!");
            }else if(palpite > numeroSecreto){
                System.out.println("o número é menor,Tente Novamente!");
            }else{
                System.out.println("Parabéns você acertou! O número secreto era "+numeroSecreto+ " e você acertou com "+tentativas+ " tentativas");
            }
        }

        scanner.close();

    }
}
