package arrays;

public class longestEvenOddElementSequence {
	public static void main(String args[]) {
		int[] arr = { 5, 10, 20, 6, 3, 8 };
		oddEven(arr);
	}

	private static void oddEven(int[] arr) {
		int res = 1, ans = 1;

		for (int i = 1; i < arr.length; i++) {
			if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
				ans++;
				res = Math.max(res, ans);
			} else
				ans = 1;
		}
		System.out.println(ans);
	}
}
