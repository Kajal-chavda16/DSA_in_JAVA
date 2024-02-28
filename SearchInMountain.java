public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,6,5,4,3,2,1};
        int target = 6 ;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr , int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderOgnasticBOS(arr, target , 0 , peak);
        if (firstTry != 1) {
            return firstTry ;
        }
        // try to search in second half
        return orderOgnasticBOS(arr, target, peak + 1, arr.length - 1);

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

    static int orderOgnasticBOS(int[] arr , int target ,int start ,int end){
       

        if (arr[start] <= arr[end]) {
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
        }

        else{
            while (start <= end) {
               
                 int mid = start + (end - start) / 2 ;
     
                 if (target < arr[mid]) {
                    start = mid + 1 ;
                 }
                 else if (target > arr[mid]) {
                    end = mid - 1 ;
                 }
                 else{
                     return mid ;
                 }
            }
        }

        return -1 ;

    }
}
