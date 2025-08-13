package entities;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangles retangulo = new Rectangles();

        System.out.println("Enter Rectangle width and height : ");
        retangulo.width = scanner.nextDouble();
        retangulo.height = scanner.nextDouble();

        System.out.println("ÁREA = " +retangulo.area());
        System.out.println("PERIMETER = "+retangulo.perimeter());
        System.out.println("DIAGONAL = "+retangulo.diagonal());

        scanner.close();

    }


}
