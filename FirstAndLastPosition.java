import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] ans1 = searchRange(arr, target);
        System.out.println(Arrays.toString(ans1));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };

        // check for first occurrence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        
        return ans;

    }

    static int search(int[] num, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = num.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}