import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args) {
        int[] arr = {1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
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