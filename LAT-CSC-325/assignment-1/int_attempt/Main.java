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
