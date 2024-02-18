public class Binarysearch{
    public static void main(String[] args) {
        int[] arr = {-15,-12,-2,0,2,5,8,33,78,688};
        int target = -15;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr , int target){
        int start = 0 ;
        int end = arr.length - 1 ;

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