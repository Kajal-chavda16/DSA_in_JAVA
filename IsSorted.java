public class IsSorted{
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,12,15,4};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] nums){
         return helper(nums, 0);
    }

    static boolean helper(int[] arr,int i){
        if (i == arr.length - 1) {
            return true ;
        }
            return arr[i] < arr[i+1] && helper(arr, i+1);
    } 
}
