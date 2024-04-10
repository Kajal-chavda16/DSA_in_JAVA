import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student vk = new Student(1, 99.5f);
        Student kv = new Student(19, 88.8f);
        Student v = new Student(22, 44.4f);

        Student[] list = {vk,kv,v};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list , (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

        if (vk.compareTo(kv) > 0) {
            System.out.println(vk.compareTo(kv));
            System.out.println("vk has more marks");
        }
    }
}
