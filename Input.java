import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int[] arr = new int[5];

        // arr[0] = 32 ;
        // arr[1] = 3 ;
        // arr[2] = 2 ;
        // arr[3] = 532 ;
        // arr[4] = 372 ;
        // [32 , 3 , 2, 532 , 372]
        // System.out.println(arr[3]);



        // input using for loops
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(arr[3]);



         // best method including for loops to print array elements
        System.out.println(Arrays.toString(arr));

        // for(int i = 0 ; i < arr.length ; i++){
        //     System.out.print(arr[i] +" ");
        // }

        // for(int num : arr){
        //     System.out.print(num +" "); // here num represent element of array
        // }



        // System.out.println(arr[5]); // index out of bound error


    }
}
