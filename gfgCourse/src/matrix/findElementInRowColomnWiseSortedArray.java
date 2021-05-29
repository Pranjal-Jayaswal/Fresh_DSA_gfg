package matrix;

public class findElementInRowColomnWiseSortedArray {
	public static void main(String args[]) {
		int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 35, 45 }, { 32, 33, 39, 50 } };
		int x = 29;
		search(arr, x, arr.length, arr[0].length);
	}

	private static void search(int[][] arr, int x, int m, int n) {
		int low = 0, high = n - 1;
		while (low < m && high >= 0) {
			if (arr[low][high] > x)
				high--;
			else if (arr[low][high] < x)
				low++;
			else if (arr[low][high] == x) {
				System.out.println(++low + "," + ++high);
				break;
			} else
				System.out.println("not found");
		}
	}
}
