import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = in.nextInt();

    evenodd(num);
    
    }

    static void evenodd(int n) {
        
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }

}
