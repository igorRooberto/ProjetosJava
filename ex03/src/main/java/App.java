import entities.Student;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Student alex = new Student("Alex", 17.0,20.0,15.0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("FINAL GRADE = "+ alex.somaNota());
        double resultado = alex.somaNota();
        alex.resultado(resultado);
    }
}
