package arrays;

import java.util.Scanner;

public class secondLargestElement {
	public static void main(String args[]) {
		int[] arr = new int[5];
		Scanner kb = new Scanner(System.in);
		int max = Integer.MIN_VALUE;

		int sMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				sMax = max;
				max = arr[i];
			}
			if (arr[i] > sMax && arr[i] < max) {
				sMax = arr[i];
			}
		}
		System.out.println(sMax);
	}
}
