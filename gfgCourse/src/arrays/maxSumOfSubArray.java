package arrays;

public class maxSumOfSubArray {
//	KADANE ALGO
	public static void main(String args[]) {
		int[] arr = { 1, -2, 3, -1, 2 };
		kadd(arr);
	}

	private static void kadd(int[] arr) {
		int res = 0, ans = 0;
		for (int i = 0; i < arr.length; i++) {
			res = (int) Math.max(arr[i], res + arr[i]);
			ans = (int) Math.max(ans, res);
		}
		System.out.println(ans);
	}
}
