public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(lcmByFormula(12,3));
    }

    static int gcd(int a , int b){
        if (a == 0) {
            return b ;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a ,int b){
        if (a % b == 0) {
            return a;
        }
        if (b % a == 0) {
            return b;
        }
        return a * b;
    }

    static int lcmByFormula(int a , int b){
        return (a * b) / gcd(a, b);
    }
}
