package binarySearchTree;

//for each node..... its left is small , right is big
//all val distinct
//treemap, treeset.....its a linked DS

class Node {
	int key;
	Node left;
	Node right;

	Node(int k) {
		key = k;
		left = right = null;
	}
}

public class BSTinJAVA {

	public static void main(String args[]) {
		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.right = new Node(20);
		root.right.left = new Node(18);
		root.right.left.left = new Node(16);
		root.right.right = new Node(80);
		int x = 16;

		if (search(root, x))
			System.out.print("Found");
		else
			System.out.print("Not Found");
	}

	public static boolean search(Node root, int x) {
		while (root != null) {
			if (root.key == x)
				return true;
			else if (root.key < x)
				root = root.right;
			else
				root = root.left;
		}
		return false;
	}
}
