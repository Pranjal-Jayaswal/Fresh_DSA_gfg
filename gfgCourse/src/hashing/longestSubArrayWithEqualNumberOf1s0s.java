package hashing;

import java.util.HashMap;

public class longestSubArrayWithEqualNumberOf1s0s {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 0, 1, 0, 0, 1, 0 };
		int len = arr.length;

		System.out.println(largestZeroSubarray(arr, len));
	}

	private static int largestZeroSubarray(int[] arr, int len) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				arr[i] = -1;
		}
		return kkkSumSubarray(arr, len, 0);

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

//		for (Map.Entry<Integer, Integer> entry : h.entrySet())
//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

	}
}
