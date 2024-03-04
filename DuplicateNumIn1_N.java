import java.util.ArrayList;
import java.util.List;

public class DuplicateNumIn1_N {
    public static void main(String[] args) {
        int[] arr = {1,1,3,2,4};
        System.out.println(findDuplicate(arr));

    }

    static int findDuplicate(int[] arr){
        cycle(arr);
        
        for(int index = 0 ; index < arr.length ; index++){

            if (index != arr[index] - 1  ) {
                return arr[index];
            } 
        }
       return -1 ;
    }

    static void cycle(int[] arr){
        int i = 0 ;
        while (i < arr.length) {
            int correctIn = arr[i] - 1 ;
            if (arr[i] != arr[correctIn]) {
                swap(arr, i, correctIn);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
