package linkedList;

public class midOfLL {
	public static void main(String args[]) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		System.out.print("Position of element in Linked List: ");
		printMiddle(head);

	}

	static void printMiddle(Node head) {
		if (head == null)
			return;
		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.print(slow.data);
	}

	static void printNthFromEnd(Node head, int n) {
		int len = 0;
		for (Node curr = head; curr != null; curr = curr.next)
			len++;
		if (len < n)
			return;
		Node curr = head;
		for (int i = 1; i < len - n + 1; i++)
			curr = curr.next;
		System.out.print(curr.data);
	}
}
