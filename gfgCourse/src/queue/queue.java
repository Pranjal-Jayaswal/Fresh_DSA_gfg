package queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class queue {

	static Queue<Integer> q = new ArrayDeque<Integer>();

	public static void main(String[] args) {

		q.offer(10);
		q.offer(20);
		q.offer(30);

		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q);
		reversequeue();
		System.out.println(q);

	}

	static void reversequeue() {
		Stack<Integer> stack = new Stack<>();
		while (!q.isEmpty()) {
			stack.add(q.peek());
			q.remove();
		}
		while (!stack.isEmpty()) {
			q.add(stack.peek());
			stack.pop();
		}
	}
}
