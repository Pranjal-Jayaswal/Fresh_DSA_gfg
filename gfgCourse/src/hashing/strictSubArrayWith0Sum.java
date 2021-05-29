package hashing;

import java.util.HashSet;
import java.util.Set;

public class strictSubArrayWith0Sum {
	public static void main(String[] args) {
		int arr[] = new int[] { 5, 3, 9, -4, -6, 7, -1 };
		int n = arr.length;
		System.out.println(ZeroSumSubarray(arr, n));
	}

	static int ZeroSumSubarray(int arr[], int n) {
		Set<Integer> us = new HashSet<Integer>();
		int prefix_sum = 0;
		// readddddddddddddddddddddddddddddddddd
		// readddddddddddddddddddddddddddddddddd
		// readddddddddddddddddddddddddddddddddd
		// readddddddddddddddddddddddddddddddddd

		us.add(0);
		for (int i = 0; i < n; i++) {
			prefix_sum += arr[i];
			if (us.contains(prefix_sum) == true)
				return 1;

			us.add(prefix_sum);
		}

		return 0;
	}
}
