package stack;

import java.util.ArrayDeque;

public class stackInJAVA {
	public static void main(String[] args) {

		ArrayDeque<Integer> stack = new ArrayDeque<>();
//		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.size();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());

	}
}
