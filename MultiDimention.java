import java.util.Arrays;
import java.util.Scanner;

public class MultiDimention {
    public static void main(String[] args) {
        
        /*
            1 2 3 
            4 5 6
            7 8 9
         */

    //    int[][] arr = new int[3][] ;
        
        // int[][] nums = {
        //     {1,2,3,4},
        //     {5,6},
        //     {7,8,9}
        // } ;


        // inputs

        Scanner in = new Scanner(System.in);

        int [][] arr = new int[3][2];
        System.out.println(arr.length);

        for( int row = 0 ; row < arr.length ; row++){
            for( int col = 0 ; col < arr[row].length ; col++ ){
                arr[row][col] = in.nextInt();
            }
        }

        // output
/*        for( int row = 0 ; row < arr.length ; row++){

            // for( int col = 0 ; col < arr[row].length ; col++ ){
            //     System.out.print(arr[row][col] + " ");
            // }
            // System.out.println();

                System.out.println(Arrays.toString(arr[row]));
         }
*/
                for(int[] a : arr){
                    System.out.println(Arrays.toString(a));
                }

    }
}
