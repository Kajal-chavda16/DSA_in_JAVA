import java.util.Scanner;

public class AreaParel{
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height and width of parallelogram : ");
        double h = in.nextDouble();
        double b = in.nextDouble();

        double a = h * b ;
        System.out.println("Area of parallelogram : "+a);

    }
}


// rhombous = bh or o.5*d1*d2 or b*b*sin(a)
// equilaterial triangle = root 3 by 4 * a square