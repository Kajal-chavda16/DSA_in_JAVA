import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee id and department : ");
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("Kajal Chavda");
                break;
            case 2:
                System.out.println("Vasu Kansagara");
                break;
            case 3:
            System.out.println("Sneha");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("No Department");
                        break;
                }
                break;
            default:
            System.out.println("Enter valid empId");
                break;
        }
    }
}
