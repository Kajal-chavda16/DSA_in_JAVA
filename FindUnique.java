public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,5,6,6,1,2};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique = 0 ;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
