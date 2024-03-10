public class ReverseNum {
    public static void main(String[] args) {
        revNum(10203);
    }

    static void revNum(int n){
        if (n%10 == n) {
            System.out.print(n%10); 
           return ;
        }
        System.out.print(n%10);
        revNum(n/10);
    }
}
