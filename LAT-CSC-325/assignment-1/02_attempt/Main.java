class Node {
	public int data;
	public Node next;

	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	public Node head;
	public Node tail;

	public LinkedList() {
		this.head = this.tail = null;
	}

	public void append(int data) {
		Node temp = new Node(data);

		if(this.head == null){
			this.head = temp;
		}
		else {
			this.tail.next = temp;
		}
		this.tail = temp;
	}

	public boolean search(int target){
		Node walker = head;
		while(walker != null) {
			if(walker.data == target) {
				return true;
			}
			walker = walker.next;
		}
		return false;
	}

	public void printAll() {
		Node walker = head;
		while(walker != null) {
			System.out.print(walker.data + ", ");
			walker = walker.next;
		}
	}
}
public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(5);
		list.append(45);
		list.append(75);
		list.append(0);
		System.out.println(list.search(5));
		System.out.println(list.search(10));
		System.out.println(list.search(75));
		System.out.println(list.search(0));
		list.printAll();
	}
}
