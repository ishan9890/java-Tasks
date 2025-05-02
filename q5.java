import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i =1;
        System.out.println("Multiplication table of" +num+":");
        do{
            System.out.println(num+"x"+i+"="+(num+i));
            i++;
        }while (i<=10);
        sc.close();


    }
}
