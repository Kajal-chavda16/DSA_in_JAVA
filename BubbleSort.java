import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0,4,3,88,0,1,2,7,5,1};
       helper(arr);
       bubbleSort(arr, arr.length-1, 0);
       System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr , int row , int col){
        if(row == 0){
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col+1]) {
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr, row, col+1);
        } else {
            bubbleSort(arr,row-1, 0);
        }   
    }

    static void helper(int[] arr){
        bubble(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr , int i , int end){
        if (end == 0) {
            // System.out.println(Arrays.toString(arr));
            return;
        }
        if (i < end ) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                bubble(arr, i+1, end);
            } else{
                bubble(arr, i+1, end);
            }
        }
        bubble(arr, i, end-1);
    }


}
