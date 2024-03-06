public class NumberExampleRecursion {
    public static void main(String[] args) {
        // print first five numbers : 1 2 3 4 5
        print(1);
    }

    static void print(int n){
        // base condition
        if (n == 5) {
            System.out.println(5);
           return; 
        }
        System.out.println(n);

        // recursive call
        // this is the last function call
        // this is called tail recursion
        print(n+1);
    }
    
}
