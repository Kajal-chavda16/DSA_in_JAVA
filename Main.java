import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(3);
        // stack.push(5);
        // stack.push(44);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(7);
        // queue.add(9);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(44);
        deque.addLast(77);
        deque.removeFirst();
    }
}