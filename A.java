// package OOP4;

public class A {
    protected int num ; 
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num , String name ) {
        // super();
        this.num = num;
        this.name = name;
        this.arr = new int[num];

    }

    public static void main(String[] args) {
        A obj = new A(0, null);
        System.out.println(obj instanceof A);
    }
}
