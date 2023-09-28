import java.util.Random;

public class main{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// prepend test
		System.out.println("Prepend test:");
		list.prepend(5);
		list.printAll();
		list.delete(5);
		list.printAll();
		System.out.print("\n");

		// append test
		System.out.println("Append test:");	
		list.append(10);
		list.printAll();
		list.delete(10);
		list.printAll();
		System.out.print("\n");

		// make list
		System.out.println("Creating new list:");	
		list.append(5);
		list.append(10);
		list.append(15);
		list.append(20);
		list.append(25);
		list.append(35);
		list.append(45);
		list.append(50);
		System.out.print("\n");

		// delete test
		System.out.println("Delete test(5, 20, 50):");
		list.delete(5);
		list.delete(20);
		list.delete(50);
		list.printAll();
		System.out.print("\n");

		// search test
		System.out.println("Search test(35):");
		System.out.println("\tFound 35? " + list.search(35));
		System.out.println("\tFound 20? " + list.search(20));
		System.out.print("\n");

		// size test
		System.out.println("Size (N=5):");
		System.out.println("\tSize N=" + list.size());
		list.printAll();
		System.out.print("\n");
		
		// returnBeforeLast() test
		System.out.println("Return Before Last test:");
		System.out.println("\tBeforeLast:" + list.returnBeforeLast());
		System.out.print("\n");
		
		// randomInsert() test
		System.out.println("randomInsert test:");
		System.out.println("\trandomInsert:" + list.randomInsert(69));
		list.printAll();
		System.out.print("\n");
	}
}


class Node {
	public Node next;
	public int data;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	public Node head;
	public Node tail;

	public LinkedList() {
		head = tail = null;
	}
	
	public void prepend(int data) { // TODO: Test this.
		Node temp = new Node(data);
		if (this.head == null) {
			this.head = temp;
		}
		else {
			temp.next = this.head;
			this.head = temp;
		}
	}

	public void append(int data) {
		Node temp = new Node(data); //New data to be assigned
		if (this.head == null) {
			this.head = temp; //If no head, make one
		} 
		else {
			this.tail.next = temp; //Make current tail point to new tail.
		}
		this.tail = temp;//New node will be new tail
	}
	
	public boolean delete(int target) { //TODO: test function
		Node walker = this.head;
		Node past = null;

		while(walker != null) {
			if(walker.data == target) {
				if(walker == this.head) {
					this.head = walker.next;
					return true;
				}
				else if(walker == this.tail){
					this.tail = past;
					this.tail.next = null;
					return true;
				}
				else {
					past.next = walker.next;
					return true;
				}
			}
			walker = walker.next;
			if(past == null) {
				past = this.head;
			}
			else {
				past = past.next;
			} 
		}
		return false;
	}

	public boolean search(int target) {
		Node counter = head; //start the counter at the start of the list.
		while(counter != null){ //while we havent hit the end
			if(counter.data == target) { // if we find the target is true.
				return true;
			}
			counter = counter.next;
		}
		return false;
	}

	public void printAll() {
		if(this.head == null){
			System.out.println("printAll(): returned nothing...");
			return;
		}
		Node counter = this.head;
		while(counter != null) {
			System.out.print(counter.data + ", ");
			counter = counter.next;
		}
		System.out.print("\n");
	}

	public int size() {
		Node walker = this.head;
		int count = 1;
		
		while(walker != null) {
			walker = walker.next;
			count++;
		}

		return count;
	}

	public int returnBeforeLast() {
        	Node walker = this.head;
            	while(walker.next.next != null) {
        		walker = walker.next;
        	}
        	return walker.data;
    	}

	public int randomInsert(int data) { //TODO: Test function
		Random rand = new Random();
		int randInt = rand.nextInt(size());
		
		Node past = null;
		Node temp = new Node(data);

		Node walker = this.head;
		for(int i = 0;i != randInt; i++){
			walker = walker.next;
			if(past == null) {
				past = this.head;
			}
			else {
				past = past.next;
			}
		}

		past.next = temp;
		temp.next = walker.next;
		return randInt;
	}
}
