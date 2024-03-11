import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,4};
        // System.out.println(max(arr));
        // selection(arr, arr.length-1);
        // System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr , int row , int col , int max){
        if(row == 0){
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) {
               selectionSort(arr, row, col+1, col);
            }else{
                selectionSort(arr, row, col+1, max);
            } 
        } else {
            int temp = arr[row-1];
            arr[row-1] = arr[max];
            arr[max] = temp;
            selectionSort(arr,row-1, 0,0);
        }   
    }

    // static void selection(int[] arr , int e){
    //     int start = 0 ;
    //     int maxElem = max(arr,e);
    //     int temp = maxElem;
    //     maxElem = arr[e];
    //     arr[e] = temp;
    //     selection(arr, e-1);
    //     // System.out.println(Arrays.toString(arr));
    // }

    // static int max(int[] arr,int end){
    //     int i;
    //     int m = arr[0];
    //     for (i = 1 ; i <= end ; i++) {
    //         if (arr[i] > m) {
    //             m = arr[i];
    //         }
    //     }
    //     return m ;
    // }
}
