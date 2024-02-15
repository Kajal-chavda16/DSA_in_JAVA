import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5) ; 
        
        // list.add(34);
        // list.add(44);
        // list.add(1);
        // list.add(14);
        // list.add(122);
        // list.add(34);
       
//        System.out.println(list.contains(154));

        // System.out.println(list);

        // list.set(0, 416);
        // list.remove(2);

        // System.out.println(list);


        // INPUT
        for(int i = 0 ; i < 5 ; i++){
            list.add(in.nextInt());
        }

        for(int i = 0 ; i < 5 ; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);

        
        
    }
}

