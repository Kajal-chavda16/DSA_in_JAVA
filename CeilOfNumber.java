public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,8,9,12,15,17};
        int target1 = 4;
        int ans = ceilingElem(arr1, target1);
        System.out.println(ans);
        
    }

    static int ceilingElem(int[] arr , int target){

        if (target > arr[arr.length - 1]) {
            return -1 ;
        }
        
        int start = 0 ;
        int end = arr.length - 1 ;
       
        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1 ;
            }
            else{
                return arr[mid] ;
            }
        }

        return arr[start];
       
    }
}
