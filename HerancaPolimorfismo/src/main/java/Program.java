import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #"+ i +" data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = scanner.nextLine().charAt(0);

            if(ch == 'c'){
                System.out.print("Name:");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                scanner.nextLine();
                list.add(new Product(name, price));
            }else if(ch == 'i'){
                System.out.print("Name:");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                System.out.print("Custom Fee:");
                Double customfee = scanner.nextDouble();
                scanner.nextLine();
                list.add(new ImportedProduct(name, price ,customfee));
            }else{
                System.out.print("Name:");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                System.out.print("Manufacture Data : ");
                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price,date));
            }

        }

        System.out.println();
        System.out.println("PRICE TAG");

        for(Product prod : list){
            System.out.println(prod.priceTag());
        }

        scanner.close();
    }
}
