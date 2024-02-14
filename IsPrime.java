import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();

        boolean ans = prime(num);
        System.out.println(ans);

    }

    static boolean prime(int n){
       
        int i = 2; 
        while (i < n) {
              if (n % i == 0) {
                return false;
              }  
              i++;   
        }

       return true ;
    }

}
