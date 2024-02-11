import java.util.Scanner;

public class AreaRect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle : ");
        double l = in.nextDouble();
        double b = in.nextDouble();

        double a = l * b ;
        System.out.println("Area of rectangle : "+a);

    }
}
