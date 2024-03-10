public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(41));
    }

    static int numberOfSteps(int num){
       return helperRec(num, 0);
    }

    static int helper(int n , int s){
        while (n > 0) {
            if (n%2 == 0) {
                n = n / 2;
                s++;
            }else{
                n--;
                s++;
            }
        }
        return s;
    }

    static int helperRec(int number , int steps){
       if (number == 0) {
            return steps;
       }

       if (number%2 == 0) {
            return helperRec(number/2, steps+1);
       }
       return helperRec(number-1, steps+1);
    }


}
