public class DoublyLL {

    private Node head;
    private Node tail;
    private int size;
    public DoublyLL() {
        this.size = 0 ;
    }

    public void display(){
        Node node = head ;
        Node last = null;
        while (node != null) {
            System.out.print(node.value+" -> ");
            last = node;
            node = node.next;
        }
        System.out.print("END");

        System.out.println();
        System.out.println("printing in rev........................");
        while (last != null) {
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.print("START");

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.prev = null ;
        node.next = head ;
        if (head != null) {
            head.prev = node ;
        }
        head = node ;

        // if (tail == null) {
        //     head = tail ;
        // }

        size += 1;
    }
    
    private class Node{

        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value , Node next , Node prevNode) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
       
    }
}
