package linkedList;

public class reverseTheLL {
	public static void main(String args[]) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head = recRevL(head, null);

	}

	static Node recRevL(Node curr, Node prev) {
		if (curr == null)
			return prev;
		Node next = curr.next;
		curr.next = prev;
		return recRevL(next, curr);
	}

	static Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
