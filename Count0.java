public class Count0 {
    public static void main(String[] args) {
        System.out.println(count0(1020304050));
    }

    static int count0(int n){
        return helper(n, 0);
    }

    static int helper(int n , int c){
        if (n == 0) {
            return c;
        }
        if (n%10 == 0) {
            return helper(n/10, c+1);
        } else{
            return helper(n/10, c);
        }
    }
}
