import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu Driven Calculator");
        System.out.println("------------------------");


        System.out.println("Enter two Integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");

        char choice = sc.next().charAt(0);

        switch (choice){
            case '+':
                System.out.println("Sum: "+ (num1 + num2));
                break;
            case '-':
                System.out.println("Difference: "+ (num1 - num2));
                break;
            case '*':
                System.out.println("Product: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Quotient: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operation!!");
        }
    }
}
