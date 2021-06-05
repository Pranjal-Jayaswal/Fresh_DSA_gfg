package linkedList;

class Node {
	int data;
	Node prev;
	Node next;

	Node(int d) {
		data = d;
		prev = null;
		next = null;
	}
}

public class insertAtBeginning {

	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}

	public static void main(String args[]) {
		Node head = null;
		head = insertBegin(head, 30);
		head = insertBegin(head, 20);
		head = insertBegin(head, 10);
		printlist(head);

	}

	public static void printlist(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}