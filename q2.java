
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum = "+ (a+b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        if (b != 0)
            System.out.println("Quotient = " + (a / b));
        else
            System.out.println("Cannot divide by zero!");
    }
}
