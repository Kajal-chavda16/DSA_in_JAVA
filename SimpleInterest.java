import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal Amount : ");
        float p = in.nextFloat();
        System.out.println("Enter Rate : ");
        float r = in.nextFloat();
        System.out.println("Enter Time : ");
        float t = in.nextFloat();
       
        float si = (p * r * t) / 100 ;
        System.out.println("Simple interest is : "+si);                   

    }
}
