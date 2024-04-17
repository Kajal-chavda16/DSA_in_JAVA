import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        System.out.println("Print any character : ");
        char ch = in.next().trim().charAt(0);

        if (ch>='a' && ch<='z') {
            System.out.println("Character is lower cased.");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Character is upper cased.");
        }
        else{
            System.out.println("Input is not character.");
        }

    }
}
