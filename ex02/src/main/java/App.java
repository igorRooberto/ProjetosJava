import entities.Employee;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee("João Silva", 6000.00,1000.00 );

        System.out.println("Employee : "+employee.getName()+ ", "+employee.netSalary());

        System.out.println("Which percentage to increase salary : ");
        double percentage = scanner.nextDouble();

        employee.increaseSalary(percentage);
        double valor = employee.netSalary() + employee.increaseSalary(percentage);

        System.out.println("Update Data = "+valor);

        scanner.close();
    }

}
