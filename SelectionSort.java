import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    
    }

    static void selection(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            int last = arr.length - i - 1;
            int max = maxIndex(arr, 0, last);
            swap(arr, last, max);
        }
    }

    static int maxIndex(int[] arr, int start , int end){
        int maxIn = 0;
        for(int i = start ; i <= end ; i++){
            if (arr[maxIn] < arr[i]) {
                maxIn = i ;
            }
        }
        return maxIn;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
