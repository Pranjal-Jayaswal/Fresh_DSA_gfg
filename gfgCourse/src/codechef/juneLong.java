package codechef;

import java.util.Scanner;

public class juneLong {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (2 * i) + 1;
		}
		int sum = 0, mid = 0;
		if (N % 2 == 0) {
			mid = arr[N / 2] - 1;
		}
		for (int i = 0; i < arr.length / 2; i++) {
			if (N % 2 != 0)
				sum += arr[N / 2] - arr[i];
			else {
				sum += mid - arr[i];
			}
		}
		System.out.println(sum);
	}
}
