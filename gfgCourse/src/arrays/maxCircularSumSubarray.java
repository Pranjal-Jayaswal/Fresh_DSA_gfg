package arrays;

public class maxCircularSumSubarray {
	public static void main(String args[]) {
		int[] arr = { 8, -4, 3, -5, 4 };
		circMax(arr);
	}

	private static void circMax(int[] arr) {
		int temp = kadd(arr);
		int sum = 0;
//		min subArr sum
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			arr[i] = -arr[i];
		}
		int temp2 = kadd(arr);

		int anss = Math.max(temp, (temp2 + sum));
		System.out.println(anss);
	}

	private static int kadd(int[] arr) {
		int res = 0, ans = 0;
		for (int i = 0; i < arr.length; i++) {
			res = (int) Math.max(arr[i], res + arr[i]);
			ans = (int) Math.max(ans, res);
		}
		return ans;
	}
}
