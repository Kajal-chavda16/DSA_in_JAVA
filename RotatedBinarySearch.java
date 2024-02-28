public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,9,10,22,25,27,2,2,2};
        // System.out.println(findPivot(arr));
        int target = 25 ;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums , int target){
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarysearch(nums, target,0, nums.length - 1);
        }
        else{
            int firstHalf = binarysearch(nums, target , 0 , pivot);
            if (firstHalf != -1) {
                return firstHalf ;
            }
            int secondHalf = binarysearch(nums, target, pivot + 1, nums.length - 1);
            return secondHalf ;
        }
       
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

    static int binarysearch(int[] arr , int target,int start , int end){
       
        while (start <= end) {
           // int mid = ( start + end ) / 2 ; // for long values that may exeed int value
            int mid = start + (end - start) / 2 ;

            if (target < arr[mid]) {
                end = mid - 1 ;
            }
            else if (target > arr[mid]) {
                start = mid + 1 ;
            }
            else{
                return mid ;
            }
       }
       return -1 ;
    }

}
