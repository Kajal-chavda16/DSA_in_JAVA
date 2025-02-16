import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        swap(arr,1,3);

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] ar , int index1 , int index2 ){
        int temp = ar[index1] ;
        ar[index1] = ar[index2] ;
        ar[index2] = temp ; 
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
