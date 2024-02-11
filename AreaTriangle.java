import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and height of triangle : ");
        double b = in.nextDouble();
        double h = in.nextDouble();

        double a = 0.5 * b * h ;
        System.out.println("Area of triangle : "+a);

    }
}
