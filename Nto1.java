public class Nto1{
    public static void main(String[] args) {
        System.out.println(print(5));
        fun(5);
    }

    static int print(int n){
        // while (n > 1) {
        //     System.out.print(n+" ");
        //     return print(n - 1);
        // }
        // return 1;

        if (n == 1) {
            return 1 ;
        }
        System.out.print(n+" ");
        return print(n - 1);
    }
       
    static void fun(int n){
       if (n == 0) {
           return ;
       }

       System.out.print(n+" ");
       fun(n - 1);
    }
}