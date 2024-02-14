import java.util.Scanner;

public class MaxMin{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter three numbers : ");
    float n1 = in.nextFloat(); 
    float n2 = in.nextFloat(); 
    float n3 = in.nextFloat(); 

    float max_ans = max(n1, n2, n3);
    System.out.println("Maximum number is : "+max_ans);

    float min_ans = min(n1, n2, n3);
    System.out.println("Minimum number is : "+min_ans);

}

    static float max(float a , float b , float c){
        float max = a ;
        if (b > max) {
            max = b ;
        }
        if (c > max) {
            max = c ;
        }
        return max;
    }

    static float min(float x , float y , float z){
        float min = x ;
        if (y < min) {
            min = y ;
        }
        if (z < min) {
            min = z ;
        }
        return min;
    }

}