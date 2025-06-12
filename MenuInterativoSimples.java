import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class MenuInterativoSimples {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{

            System.out.println("----------MENU INTERATIVO-----------");
            System.out.println("Escolha uma opção");
            System.out.println();
            System.out.println("1) hamburguer");
            System.out.println("2) Sushi");
            System.out.println("3) Refrigerante");
            System.out.println("4) Sair");

            System.out.println();
            System.out.println("Digite uma opção : ");
             opcao = scanner.nextInt();

            System.out.println("A opção escolhida foi = "+opcao);


        }while(opcao != 4);

        System.out.println("Saindo do Programa");

        scanner.close();
    }
}
