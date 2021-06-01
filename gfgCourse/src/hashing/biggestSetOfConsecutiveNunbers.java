package hashing;

import java.util.HashSet;

public class biggestSetOfConsecutiveNunbers {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 9, 3, 4, 2, 10, 13 };
		int n = arr.length;
		System.out.println(findLongest(arr, n));
	}

	private static int findLongest(int[] arr, int n) {
		HashSet<Integer> h = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			h.add(arr[i]);
		}
		int ans = 0, res = 1, temp = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!h.contains(arr[i] - 1)) {
				while (h.contains(arr[i] + temp)) {
					res++;
					temp++;
				}
			}
			ans = Math.max(ans, res);
			res = 0;
		}
		return ans;
	}
}
