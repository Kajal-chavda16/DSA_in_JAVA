public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(prodOfDigits(505));
    }

    static int prodOfDigits(int n){
        if (n%10 == n) {
            return n ;
        }
        return (n%10) * prodOfDigits(n/10);
    }
}
