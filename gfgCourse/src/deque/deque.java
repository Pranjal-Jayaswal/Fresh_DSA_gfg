package deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class deque {

//	can act as both stack and queue
//	add 
//	offer
//	push 
//	poll
//	remove
//	get
//	peek

	public static void main(String args[]) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.remove();

		System.out.println(ad);
		ad.offer(40);
		System.out.println(ad);

		System.out.println(ad.peek() + "    1");
		System.out.println(ad.poll() + "     2");
		System.out.println(ad);

		ad.offer(50);
		ad.push(60);
		ad.push(70);

		System.out.println(ad);

		ad.offerFirst(80);
		ad.offerLast(90);

		System.out.println(ad);

		ad.addFirst(100);

		System.out.println(ad.peekFirst());

		Iterator<Integer> it = ad.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();

	}
}
