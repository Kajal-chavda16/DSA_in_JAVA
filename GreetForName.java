import java.util.Scanner;

public class GreetForName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.next();

        System.out.println("Hello , " +name+ " . Nice to meeting you !!");
    }
}
