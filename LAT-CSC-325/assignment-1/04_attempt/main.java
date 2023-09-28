class Node {
	public int data;
	public Node next;

	public Node(int data){ //Check this
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	public Node head;
	public Node tail;

	public LinkedList(){
		head = tail = null;
	}

	public void append(int data) {
		Node temp = new Node(data);
		if(this.head == null) {
			this.head = temp;
		}
		else {
			this.tail.next = temp;
		}
		this.tail = temp;
	}

	public boolean search(int target) {
		Node walker = head;
		while(walker != null){
			if(walker.data == target) {
				return true;
			}
		}
		return false;
	}

	public void printAll() {
		Node walker = head;
		while(walker != null){
			System.out.print(walker.data + ", ");
		}
		System.out.print("\n");
	}
}

public class main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);

		list.printAll();

		System.out.println(list.search(1));
		System.out.println(list.search(3));
		System.out.println(list.search(5));
		System.out.println(list.search(15));
	}
}
