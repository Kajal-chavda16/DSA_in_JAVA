public class Mountain {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,3,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0 ;
        int end = arr.length - 1 ;

        while (start < end) {
            int mid = start + (end - start) / 2 ;

            if (arr[mid] > arr[mid + 1]) {
                // you are in dsc part of array
                // this may be he answer , but look at left
                // this is why end != mid - 1
                end = mid ;
            }
            else{
                // you are in asc part of array
                start = mid + 1 ; // bcz we know that mid+1 element > mid element
            }
        }
        return start ; 
    }

}
