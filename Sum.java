import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // int ans = sum2();
        // System.out.println("sum is : "+ans);

        int ans = sum3(20 , 30);
        System.out.println(ans);
    }

    // pass the value of numbers when you calling the method in main()
    static int sum3(int a, int b){
        int sum = a+b;
        return sum ;
    }

    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        return sum;
    }

    // return void
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The Sum = "+sum);
    }

}