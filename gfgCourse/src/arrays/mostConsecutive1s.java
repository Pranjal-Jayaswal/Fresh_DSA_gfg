package arrays;

public class mostConsecutive1s {
	public static void main(String args[]) {
		int[] arr = { 0, 1, 1, 0, 1, 1, 1 };
		oness(arr);
	}

	private static void oness(int[] arr) {
		int res = 0, ans = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				res++;
				ans = Math.max(ans, res);
			} else
				res = 0;
		}
		System.out.println(ans);
	}
}
