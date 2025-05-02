import java.util.Scanner;

public class even {
    public static boolean isEven(int n){
        return n%2==0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        sc.close();


    }
}
