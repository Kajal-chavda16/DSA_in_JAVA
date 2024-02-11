import java.util.Scanner;

public class AreaIsoceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and height of isoceles triangle : ");
        double b = in.nextDouble();
        double h = in.nextDouble();

        double a = (b * h) / 2 ;
        System.out.println("Area of isoceles triangle : "+a);

    }
}
