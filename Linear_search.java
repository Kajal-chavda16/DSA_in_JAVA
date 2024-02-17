public class Linear_search{
    public static void main(String[] args){

        int[] nums = {2,55,35,77,96,784,56,7,21};
        int key = 2 ;
        int ans = linear_search(nums, key);
        System.out.println(ans); 
        int key2 = 35 ;
        boolean ans2 = linear_search2(nums, key2);
        System.out.println(ans2); 

    }

    // searck target/element itself of any index
    static boolean linear_search2(int arr[] , int target){
       
        if (arr.length == 0) {
            return false ;
        }

        for(int index = 0 ; index < arr.length ; index++){
            if ( arr[index] == target ) {
                return true ;
            }
        }

        return false;
    }

    // search target's index
    static int linear_search(int arr[] , int target){
       
        if (arr.length == 0) {
            return -1 ;
        }

        for(int index = 0 ; index < arr.length ; index++){
            if ( arr[index] == target ) {
                return index ;
            }
        }

        return -1;
    }
}