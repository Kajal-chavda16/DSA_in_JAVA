public class FindUniqueInOddRepetation {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,3,5,5,2,3,5};
        System.out.println(ans(arr));
    }

    static int ans(int[] B){
        int ones = 0 ; 
        //bit-sets for those which are visited two times. 
         int twos = 0 ;  
        //just to reset twos and ones if the number are visited three times 
         int not_threes;  


         for( int x:B ) { 
                twos |= ones & x ;  
                ones ^= x ;  

                not_threes = ~(ones & twos) ;  
                ones &= not_threes ;  
                 twos &= not_threes ;  
         }  

         return ones ;

        // int sum = 0 ;
        // for (int i : arr) {
        
        // }
        // int answer = sum % 3 ;
        // return answer;
    }
}
