import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any fruit : ");
/*        String fruit = in.next();

        switch (fruit) {

            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;

            default:
            System.out.println("Enter valid fruit");
                break;
        }
 */

        int day = in.nextInt();

        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            
            case 6,7 -> System.out.println("Weekend");
           
            default -> System.out.println("Enter valid number.");
        }
       
        
    }
}