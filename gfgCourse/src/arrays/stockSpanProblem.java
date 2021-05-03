package arrays;

public class stockSpanProblem {
	public static void main(String args[]) {
		int[] arr = { 1, 5, 3, 8, 12 };
		stock(arr);
	}

	private static void stock(int[] arr) {
		int profit = 0, initial = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > initial)
				profit += (arr[i] - initial);
			initial = arr[i];
		}
		System.out.println(profit);
	}
}
