package hashing;

import java.util.HashMap;

public class longeststrictSubArrayWithKKKSum {
//	readddddddddddddddddddddddddddddddddddddddddddddddddd
//	readddddddddddddddddddddddddddddddddddddddddddddddddd
//	readddddddddddddddddddddddddddddddddddddddddddddddddd
//	readddddddddddddddddddddddddddddddddddddddddddddddddd

//	readddddddddddddddddddddddddddddddddddddddddddddddddd

	public static void main(String[] args) {
		int arr[] = new int[] { 1, -1, 1, -1, -1, 1, -1 };
		int n = arr.length, kkk = 0;
		System.out.println(kkkSumSubarray(arr, n, kkk));
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
