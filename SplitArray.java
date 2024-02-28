import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int m = 5;
        // System.out.println(splitArray(arr, m));
        System.out.println(abc(arr, m));
    }

    static int abc(int[] arr , int m){
        if (m == 1) {
            int sum1 = 0 ;
            for (int i = 0 ; i <= arr.length - 1 ; i++) {
                        sum1 = sum1 + arr[i];
                    }
            return sum1 ;
        }
        if (m == arr.length) {
            int max = arr[0];
            int i = 0 ;
            while (i < arr.length) {
               
                if (arr[i] > max) {
                    max = arr[i] ;
                }
                i++;
            }
            return max ;
        }
        return -1;
    }

    // static int splitArray(int[] nums, int splitPoint) {
       
    //     int sum1 = 0 , sum2 = 0 ;

    //     for (int index = 0; index <= splitPoint; index++) {
    //         sum1 = sum1 + nums[index];
    //     }
    //     for (int index = splitPoint + 1 ; index <= nums.length - 1; index++) {
    //         sum2 = sum2 + nums[index];
    //     }
    //     if (sum1 > sum2) {
    //         return sum1 ;
    //     } else {
    //         return sum2;
    //     }
    // }
}
