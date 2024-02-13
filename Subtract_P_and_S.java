import java.util.Scanner;

public class Subtract_P_and_S {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any integer number : ");
        int n = in.nextInt();
        int original = n;

        if (n < 0) {
            System.out.println("number is not integer.");
        }

        int sum = 0 ;
        while (n != 0) {
            int rem = n % 10 ;
            sum = sum + rem;
            n = n / 10 ;
        }
        System.out.println("sum of digits : "+sum);
        
        n = original ;
        int product = 1 ;
        while (n != 0) {
            int rm = n % 10 ;
            product = product * rm;
            n = n / 10 ;
        }
        System.out.println("product of digits : "+product);

        int subtract = product - sum ;
        System.out.println("Result : "+subtract);

    }

}
