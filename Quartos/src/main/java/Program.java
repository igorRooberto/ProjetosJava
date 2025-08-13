import entities.Clientes;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Clientes[] cliente = new Clientes[10];

        System.out.print("How many rooms will be rented ? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n;i++){
            System.out.printf("\nRENT #%d\n",i+1);
            System.out.print("Name :");
            String name = sc.nextLine();
            System.out.print("Email :");
            String email = sc.nextLine();
            System.out.print("Room : ");
            int room = sc.nextInt();
            sc.nextLine();
            cliente[room] = new Clientes(name,email);

            }
            System.out.println();
            System.out.println("Busy rooms:");
            for(int i = 0; i < 10;i++){
                if(cliente[i] != null) {
                    System.out.println(i + ":" +cliente[i].toString());

                }
            }


        sc.close();
    }
}
