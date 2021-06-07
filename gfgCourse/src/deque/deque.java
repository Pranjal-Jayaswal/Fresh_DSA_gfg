package deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class deque {
	public static void main(String args[]) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

		ad.add(10);
		ad.add(20);
		ad.add(30);

		System.out.println(ad);
		ad.offer(10);
		ad.offer(20);

		System.out.println(ad.peek() + "    1");

		System.out.println(ad.poll() + "     2");

		System.out.println(ad.peek() + "     3");

		ad.offer(40);

		System.out.println(ad.peek() + "     4");

		ad.push(10);
		ad.push(20);
		ad.offerFirst(10);
		ad.offerLast(20);
		ad.offerFirst(30);
		ad.offerLast(40);

		System.out.println(ad.peekFirst() + "     5");

		System.out.println(ad.peekLast() + "      6");

		Iterator it = ad.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();

		// Traversal using for-each
		for (int x : ad)
			System.out.print(x + " ");
		System.out.println();

	}
}
