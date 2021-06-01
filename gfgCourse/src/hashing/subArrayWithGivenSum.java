package hashing;

import java.util.HashSet;

public class subArrayWithGivenSum {
	public static void main(String args[]) {
		int arr[] = new int[] { 5, 8, 6, 13, 3, -1 };
		int sum = 22;
		int n = arr.length;

		System.out.println(isSum(arr, n, sum));
	}

	private static boolean isSum(int[] arr, int n, int k) {
		HashSet<Integer> h = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			h.add(sum);
			if (sum == k || h.contains(sum - k))
				return true;
		}
//		System.out.println(h);
		return false;

//		sumOf2NumberSOLUTIONNNNN
//		HashSet<Integer> h = new HashSet<>();
//		for (int i = 0; i < arr.length; i++) {
//			h.add(arr[i]);
//			if (arr[i] == sum) {
//				return true;
//			}
//			if (h.contains(sum - arr[i]))
//				return true;
//
//		}
//		return false;

	}
}