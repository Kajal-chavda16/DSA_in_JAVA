import java.util.Scanner;

public class AreaCircle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radious of circle : ");
        double r = in.nextDouble();

        double a = Math.PI * r * r ;
        System.out.println("Area of circle : "+a);

    }
}