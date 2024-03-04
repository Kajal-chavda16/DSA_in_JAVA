import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAll1_N {
    public static void main(String[] args) {
        int[] arr = {3,4,2,6,6,2};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missingAll(arr));
        // System.out.println();
    }

    static List<Integer> missingAll(int[] arr){
        cycle(arr);
        List<Integer> ans = new ArrayList<>();
        
        for(int index = 0 ; index < arr.length ; index++){

            if (index != arr[index] - 1  ) {
                // System.out.println(index + 1);
               ans.add(index + 1);
            } 
        }
        return ans;
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
