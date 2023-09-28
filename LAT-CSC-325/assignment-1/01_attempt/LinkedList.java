public class LinkedList {
	public Node head;
	public Node tail;

	public LinkedList(){
		head = tail = null;
	}
	
	public void append(int data){
		Node temp = new Node(data);

		if(head == null){
			this.head = temp;
		}
		else {
			this.tail.next = temp;
		}
		this.tail = temp;
	}

	public boolean search(int query){
		Node walker = this.head;

		while(walker != null){
			if (walker.data == query) {
				return true;
			}
			walker = walker.next;
		}
		return false;
	}

	public void printAll(){
		Node walker = this.head;

		while(walker != null) {
			System.out.print(walker.data + ", ");
			walker = walker.next;
		}
	}

}
