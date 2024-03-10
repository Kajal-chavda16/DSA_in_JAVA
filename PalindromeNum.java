public class PalindromeNum {
    public static void main(String[] args) {
        rev(121);
        System.out.println(sum == 121);
        // System.out.println(palin(121234));
       
    }

    // static boolean palin(int n){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     list.add(n);
    //     list.spliterator();
    //     int start = 0;
    //     int end = list.size()-1 ;

    //     while (start < end) {
    //         if (list.get(start) == list.get(end)) {
    //             start++;
    //             end--;
    //         } else{
    //             return false ;
    //         }
    //     }
    //     return true;
    // }

    static int sum=0;
    static void rev(int n){  
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10 + rem;
        rev(n/10);    
    }
    
}
