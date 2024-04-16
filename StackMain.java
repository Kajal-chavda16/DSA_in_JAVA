public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack cs = new DynamicStack(5);
        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
        cs.push(6);

        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
    }
}
