import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kajal = new Human(21 , "Kajal chavda");
        // Human twin = new Human(kajal);

        Human twin = (Human)kajal.clone();
        System.out.println(twin.age +" "+ twin.name);
        System.out.println(Arrays.toString(twin.arr)); 

        twin.arr[0] = 100 ;
        System.out.println(Arrays.toString(kajal.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
