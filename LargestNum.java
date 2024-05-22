import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        float num1 = in.nextFloat();
        float num2 =in.nextFloat();

        if (num1>num2) {
            System.out.println("largest number : "+num1);
        }
        else if (num2>num1) {
            System.out.println("largest number : "+num2);
        }
        else{
            System.out.println("both numbers are equal.");
        }
    }
}
