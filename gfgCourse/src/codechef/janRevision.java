package codechef;

import java.util.HashMap;

public class janRevision {
	public static void main(String args[]) {
		int arr[] = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
		cal(arr);
	}

	private static void cal(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				arr[i] = -1;
		}
		int[] temp1 = longestSubarray(arr);
		for (int i = 0; i < temp1.length; i++) {
			System.out.println(temp1[i]);
		}
	}

	public static int[] longestSubarray(int[] nums) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		int arr[] = new int[2];
		int pre_sum = 0, ans = 0;
		for (int i = 0; i < nums.length; i++) {
			pre_sum += nums[i];
			if (pre_sum == 0) {
				ans = Math.max(ans, i);
				arr[0] = 0;
				arr[1] = i;
			}
			if (h.containsKey(pre_sum)) {
				if (ans < (i - h.get(pre_sum))) {
					arr[0] = h.get(pre_sum);
					arr[1] = i;
					ans = i - h.get(pre_sum);
				}
			} else
				h.put(pre_sum, i);
		}
		return arr;
	}
}
