public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {6,7,8,9,10,55,66,77};
        System.out.println(rotateCount(nums));
    }

    static int rotateCount(int[] arr){
        int pivot = findPivot(arr);
        // int count = pivot + 1 ;
        // if (pivot == -1) {
        //     return 0 ;
        // } 
            return pivot + 1 ;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1 ;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;
            // 4 case 
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid ;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1 ;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1 ;
            }else{
                start = mid + 1 ;
            }
        }
        return -1 ;
    }
}
