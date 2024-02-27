public class BiSearchInInfinite {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,12,14,17,19,20,33};
        int target = 1;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr , int target){
        // first find the range
        // first start with a box of size 2
        int start = 0 ;
        int end = 1;

        // condition for the target lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // end = previous end + size of chunk * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return infiniteCheck(arr, target, start, end);

    }
    static int infiniteCheck(int[] arr , int target , int start ,int end){

        while (start <= end) {
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
