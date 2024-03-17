import java.util.ArrayList;
import java.util.List;
 // https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class AllDuplicateNumsIn1_N {
    public static void main(String[] args) {
        int[] arr = { 4,3,2,7,8,2,3,1 };
        System.out.println(duplicateAll(arr));
    }

    static List<Integer> duplicateAll(int[] arr) {
        cycle(arr);
        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {

            if (index != arr[index] - 1) {
                // System.out.println(index + 1);
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIn = arr[i] - 1;
            if (arr[i] != arr[correctIn]) {
                swap(arr, i, correctIn);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
