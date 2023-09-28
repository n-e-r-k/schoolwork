public class LinkedList {
    public Node head;
    public Node tail;
    
    public LinkedList() {
        head = tail = null;
    }
    
    public void append(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        }
        else {
            tail.next = temp;
        }
        tail = temp;
    }
    
    public boolean search(int target) {
        boolean result = false;
        Node walker = head;
        while (walker != null) {
            if (walker.data == target) {
                result = true;
                break;
            }
            walker = walker.next;
        }
        return result;
    }
    
    public void printAll() {
        Node walker = head;
        while (walker != null) {
            System.out.print(walker.data + ", ");
            walker = walker.next;
        }
    }
}
