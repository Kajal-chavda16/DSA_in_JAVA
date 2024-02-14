import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name and age : ");
        String naam = in.nextLine();
        int ag = in.nextInt();

        vote(naam, ag);

    }

    static void vote(String name ,int age){
        if (age <= 0) {
            System.out.println("please enter valid age .");
        }
        else if(age > 0){
            if (age >= 18) {
                System.out.println(name+ " is eligible for vote");
            }
            else{
                System.out.println(name+ " is not eligible for vote");
            }
        }
    }

}
