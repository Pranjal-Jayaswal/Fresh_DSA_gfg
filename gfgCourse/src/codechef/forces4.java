package codechef;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class forces4 {
	static int xorPairCount(int arr[], int n, int x) {
		int result = 0;
		aa: {
			Map<Integer, Integer> m = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int curr_xor = x ^ arr[i];
				if (m.containsKey(curr_xor)) {
					System.out.println("YES");
					break aa;
				}

				m.put(arr[i], 1);

			}
			System.out.println("NO");
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		while (N-- > 0) {
			int n = kb.nextInt();
			int t = kb.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = kb.nextInt();
			}
			xorPairCount(arr, n, t);
		}
	}
}
