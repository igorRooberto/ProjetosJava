import entities.Pessoas;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serão digitadas : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Pessoas[] vect1 = new Pessoas[n];

        for(int i = 0;i < vect1.length;i++){
            System.out.printf("Dados da %da Pessoa\n",i+1);
            System.out.print("Nome :");
            String name = scanner.nextLine();
            System.out.print("Idade : ");
            int idade = scanner.nextInt();
            System.out.print("Altura : ");
            double altura = scanner.nextDouble();
            scanner.nextLine();
            vect1[i] = new Pessoas(name, idade ,altura);
        }

        double soma = 0.0;
        for(int i = 0 ; i < vect1.length;i++){
            soma += vect1[i].getAltura();
        }
        double totalAltura = Pessoas.mediaAltura(soma, vect1.length);

        int nmenores = 0;
        for(int i = 0;i < vect1.length;i++){
            if(vect1[i].getIdade() < 16){
                nmenores++;
            }
        }

        double percentualMenores = ((double)nmenores / vect1.length) * 100.0;

        System.out.printf("ALTURA MÉDIA : %.2f\n ", totalAltura);
        System.out.printf("Pessoas com menos de 16 anos : %.2f\n",percentualMenores);

        for(int i = 0;i < vect1.length;i++){
            if(vect1[i].getIdade() < 16){
                System.out.println(vect1[i].getName());
            }
        }


        scanner.close();

    }
}
