import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        float num1 = in.nextFloat();
        System.out.println("Enter 2nd number : ");
        float num2 = in.nextFloat();
        System.out.println("Enter operator");
        char op = in.next().trim().charAt(0);

        float ans = 0 ;

        if (op == '+') {
            ans = num1 + num2 ;
            System.out.println(ans);
        }
        else if (op == '-') {
            ans = num1 - num2 ;
            System.out.println(ans);
        }
        else if (op == '*') {
            ans = num1 * num2 ;
            System.out.println(ans);
        }
        else if (op == '/') {
            ans = num1 / num2 ;
            System.out.println(ans);
        }
        else{
            System.out.println("Invalid Operator !!");
        }

    }
}
