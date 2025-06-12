import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número : ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite um número : ");
        double num2 = scanner.nextDouble();

        System.out.println();

        System.out.println("Escolha uma operação a ser realizada : ");
        System.out.println("1) Soma");
        System.out.println("2) Multiplicação");
        System.out.println("3) Divisão");
        System.out.println("4) Subtraçao");
        int calculo = scanner.nextInt();

        switch(calculo){
            case 1:
                System.out.println("Soma = "+ (num1 + num2));
                break;
            case 2:
                System.out.println("Multiplicação = "+ (num1 * num2));
                break;
            case 3:
                if(num2 == 0){
                    System.out.println("Não é possível dividir por zero");
                    break;
                }
                System.out.println("Divisão = "+ (num1 / num2));
                break;
            case 4:
                System.out.println("Subtração = "+ (num1 - num2));
                break;
            default:
                System.out.println("Número Inválido!");
                break;
        }

        scanner.close();
    }
}
