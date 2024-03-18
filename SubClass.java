// package OOP4;

public class SubClass extends A {
    public SubClass(int num , String name) {
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass objNew = new SubClass(66, "vasu");
        int n = objNew.num;
        System.out.println(n);

        // A obj = new A(0, null);
        System.out.println(objNew instanceof Object);
    }
}
