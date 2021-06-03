package linkedList;

import java.util.LinkedList;

public class LLinJava {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");
		System.out.println(ll);

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		ll.set(0, "For");
		System.out.println(ll);

		int i = 0;
		System.out.print(ll.get(i) + " ");

	}
}
