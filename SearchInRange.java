public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {3,55,74,2,65,767,8,29};
        int target = 65;
        int start = 3;
        int end = 6;

        System.out.println(search_in_range(arr, target, start, end));
    }

    static int search_in_range(int arr[] , int target , int start , int end){
       
        if (arr.length == 0) {
            return -1 ;
        }

        for(int index = start ; index <= end ; index++){
            if ( arr[index] == target ) {
                return index ;
            }
        }

        return -1;
}
}