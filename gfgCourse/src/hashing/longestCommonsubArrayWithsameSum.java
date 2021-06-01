package hashing;

import java.util.HashMap;

public class longestCommonsubArrayWithsameSum {
	public static void main(String args[]) {
		int[] arr1 = { 0, 1, 0, 1, 1, 1, 1 };
		int[] arr2 = { 1, 1, 1, 1, 1, 0, 1 };
		int n = arr1.length;
		System.out.println(longestCommonSum(arr1, arr2, n));
	}

	private static int longestCommonSum(int[] arr1, int[] arr2, int n) {
		int[] ans = new int[arr1.length];
		for (int i = 0; i < ans.length; i++) {
			if (arr1[i] == arr2[i]) {
				ans[i] = -1;
			} else
				ans[i] = 1;
		}
		return kkkSumSubarray(ans, n, 0);
	}

	static int kkkSumSubarray(int[] arr, int n, int k) {
		int s = 0, ans = 0;
		HashMap<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
			if (s == k)
				ans = i + 1;
			if (!m.containsKey(s)) {
				m.put(s, i);
			}
			if (m.containsKey(s - k)) {
				if (ans < i - m.get(s - k))
					ans = i - m.get(s - k);
			}

		}
		return ans;
	}
}
