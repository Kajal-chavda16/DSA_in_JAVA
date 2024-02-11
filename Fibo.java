import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int p = 0;
        int i = 1;

        System.out.print("0 1");
        int f = 2;
        while (f<=n) {

            int temp = i;
            i = i + p;
            p = temp;
            f++;
            
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println(" "+i);
    }
}
