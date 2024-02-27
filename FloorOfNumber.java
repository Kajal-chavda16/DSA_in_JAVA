public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,8,9,12,15,17};
        int target1 = 0;
        int ans = floorElem(arr1, target1);
        System.out.println(ans);
    }

    static int floorElem(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }

        return arr[end];

    }
}
