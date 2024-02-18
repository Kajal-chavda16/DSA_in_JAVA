public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {76,565,343,99};
        System.out.println(min(arr));
    }

    static int min(int[] arr){

        if (arr.length == 0) {
            return -1 ;
        }
        
        int min = arr[0] ;

        for(int index = 1 ; index < arr.length ; index++){
            if (arr[index] < min ) {
                int temp = min ;
                min = arr[index];
                arr[index] = temp;
            }

        }

        return min;
    }
}
