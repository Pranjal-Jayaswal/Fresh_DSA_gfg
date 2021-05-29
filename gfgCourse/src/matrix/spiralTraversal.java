package matrix;

public class spiralTraversal {
	public static void main(String args[]) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printSpiral(arr, 4, 4);
	}

	static void printSpiral(int[][] arr, int i, int j) {
		for (int j2 = 0; j2 < arr.length; j2++) {
			if (j2 % 2 == 0) {
				for (int k = 0; k < arr[j2].length; k++) {
					System.out.println(arr[j2][k]);
				}
			} else {
				for (int k = arr[j2].length - 1; k >= 0; k--) {
					System.out.println(arr[j2][k]);

				}
			}
		}
	}
}
