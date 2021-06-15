package codechef;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class june10 {

//	public int[][] diagonalSort() {
//		int mat1[][] = { { 11, 25, 66, 1, 69, 7 }, { 23, 55, 17, 45, 15, 52 }, { 75, 31, 36, 44, 58, 8 },
//				{ 22, 27, 33, 25, 68, 4 }, { 84, 28, 14, 11, 5, 50 } };
//		int m = mat1.length;
//		int n = mat1[0].length;
//		
//		for (int k = n - 1; k >= 1; k--) {
//			List<Integer> list = new ArrayList<Integer>();
//			int j = k;
//			for (int i = 0; i <= m - 1; i++) {
//				list.add(mat1[i][j]);
//				j++;
//				if (j > n - 1) {
//					break;
//				}
//			}
//			Collections.sort(list);
//			int i = 0;
//			j = k;
//			for (Integer listItem : list) {
//				mat1[i][j] = listItem;
//				i++;
//				j++;
//				if (i > m - 1 || j > n - 1) {
//					break;
//				}
//			}
//		}
//
//		for (int k = 0; k <= m - 1; k++) {
//			List<Integer> list = new ArrayList<Integer>();
//			int i = k;
//			for (int j = 0; j <= n - 1; j++) {
//				list.add(mat1[i][j]);
//				i++;
//				if (i > m - 1) {
//					break;
//				}
//			}
//			Collections.sort(list);
//			i = k;
//			int j = 0;
//			for (Integer listItem : list) {
//				mat1[i][j] = listItem;
//				i++;
//				j++;
//				if (i > m - 1 || j > n - 1) {
//					break;
//				}
//			}
//		}
//		return mat1;
//	}

	public static void main(String args[]) {

		june10 a = new june10();
		TreeNode root = new TreeNode(50);
		root.left = new TreeNode();
		root.right = new TreeNode(54);
//		root.left.left = new TreeNode(2);
//		root.left.right = new TreeNode(7);
		root.right.left = new TreeNode(98);
		root.right.right = new TreeNode(6);
//		root.left.left.left = new TreeNode(9);
//		root.left.left.right = new TreeNode();
//		root.left.right.left = new TreeNode(1);
//		root.left.right.right = new TreeNode(4);
		root.right.left.left = new TreeNode();
		root.right.left.right = new TreeNode();
		root.right.right.left = new TreeNode();
		root.right.right.right = new TreeNode(34);
		System.out.println(a.sumEvenGrandparent(root));
//		System.out.println("aaaaaaaa");
//		System.out.println(deepestLeavesSum(root) + "rr");
	}

	int sum = 0;

	public int sumEvenGrandparent(TreeNode root) {
		if (root == null)
			return 0;
		if (root.val % 2 == 0) {
			sumAllFour(root);
		}
		sumEvenGrandparent(root.left);
		sumEvenGrandparent(root.right);

		return sum;
	}

	void sumAllFour(TreeNode root) {
		if (root.left != null) {
			if (root.left.left != null) {
				sum += root.left.left.val;
			}
			if (root.left.right != null) {
				sum += root.left.right.val;
			}
		}
		if (root.right != null) {
			if (root.right.left != null) {
				sum += root.right.left.val;
			}
			if (root.right.right != null) {
				sum += root.right.right.val;
			}
		}
	}

//	public static int deepestLeavesSum(TreeNode root) {
//		int sum = 0;
//		Queue<TreeNode> q = new LinkedList<>();
//		TreeNode t = new TreeNode(-1);
//		q.add(root);
//		q.add(t);
//		while (!q.isEmpty()) {
//			TreeNode temp = q.poll();
//			if (temp.val == -1) {
//				if (!q.isEmpty()) {
//					sum = 0;
//					q.add(t);
//
//				} else {
//					break;
//				}
//			} else
//				sum += temp.val;
//
//			if (temp.left != null) {
//				q.add(temp.left);
//			}
//			if (temp.right != null) {
//				q.add(temp.right);
//			}
////		int currLevel = 0, sum = 0, high = 0;
////		high = heightt(root);
////		Queue<TreeNode> q = new LinkedList<>();
////		TreeNode t = new TreeNode(-1);
////		q.add(t);
////		q.add(root);
////		while (!q.isEmpty()) {
////			TreeNode temp = q.poll();
////
////			if (temp.left != null) {
////				q.add(temp.left);
////			}
////			if (temp.right != null) {
////				q.add(temp.right);
////			}
////			if (temp.val == -1) {
////				currLevel++;
////				q.add(t);
////			}
////			if (currLevel == high) {
////				while (!q.isEmpty()) {
////					sum += q.poll().val;
////				}
////			}
////
////		}
////		return sum + 1;
////	}
////
////	public static int heightt(TreeNode root) {
////		if (root == null) {
////			return 0;
////		}
////		return (1 + Math.max(heightt(root.left), heightt(root.right)));
//		}
//		return sum;
//
//	}
}