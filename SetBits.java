public class SetBits {
    public static void main(String[] args) {
        int n = 250;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    static int setBits(int n){
        int count = 0 ;
       
        while (n > 0) {
             if ( (n & 1) == 1 ) {
                count++;
                n = n >> 1;
            } else{
                n = n >> 1;
            }
        }
        return count ;
    }

}