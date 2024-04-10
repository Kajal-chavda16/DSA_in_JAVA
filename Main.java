import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(22);
        list2.add(44);
        list2.add(11);
        list2.add(88);

        System.out.println(list2);

        List<Integer> vector = new Vector();

        vector.add(22);
        vector.add(44);
        vector.add(11);
        vector.add(88);

        System.out.println(vector);
    }
}