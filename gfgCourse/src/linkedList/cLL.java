package linkedList;

public class cLL {

	public static void main(String args[]) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = head;
		head = insertBegin(head, 15);
		printlist(head);

	}

	public static void printlist(Node head) {
		if (head == null)
			return;
		Node r = head;
		do {
			System.out.print(r.data + " ");
			r = r.next;
		} while (r != head);
	}

	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		if (head == null) {
			temp.next = temp;
			return temp;
		} else {
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			return head;
		}
	}

	static Node insertEnd(Node head, int x) {
		Node temp = new Node(x);
		if (head == null) {
			temp.next = temp;
			return temp;
		} else {
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			return temp;
		}
	}

	static Node deleteKth(Node head, int k) {
		if (head == null)
			return head;
		if (k == 1)
			return deleteHead(head);
		Node curr = head;
		for (int i = 0; i < k - 2; i++)
			curr = curr.next;
		curr.next = curr.next.next;
		return head;
	}

	static Node deleteHead(Node head) {
		if (head == null)
			return null;
		if (head.next == head)
			return null;
		head.data = head.next.data;
		head.next = head.next.next;
		return head;
	}
}
