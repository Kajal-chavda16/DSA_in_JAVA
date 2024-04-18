import java.util.Stack;

public class QueueUsingStackRemove{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) throws Exception{
       while (!first.isEmpty()) {
            second.push(first.pop());
       }
       first.push(item);
       while (!second.isEmpty()) {
            first.push(second.pop());
       }
    }

    public int remove() {
       return first.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }
}
