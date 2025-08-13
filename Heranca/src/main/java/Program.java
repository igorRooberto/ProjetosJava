import entities.Company;
import entities.Individual;
import entities.TaxPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TaxPlayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1;i <= n;i++){
            System.out.println("Tax Player #"+ i +" data: " );
            System.out.print("Individual or company (i/c)?");
            char ch = scanner.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Anual income: ");
            Double price = scanner.nextDouble();
            scanner.nextLine();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double health = scanner.nextDouble();
                list.add(new Individual(price, name, health));
            }else{
                System.out.print("Number of employees:");
                int employees = scanner.nextInt();
                list.add(new Company(price, name, employees));
            }

            System.out.println();
            System.out.println("TAXES PAID");
            double sum = 0.0;
            for(TaxPlayer tp : list){
                double tax = tp.tax();
                System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
                sum += tax;
            }

            System.out.println();
            System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

            scanner.close();


        }







    }
}
