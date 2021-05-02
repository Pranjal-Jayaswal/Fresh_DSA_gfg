package bitManipulation;

import java.util.Scanner;

public class twoOddOccuringElement {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		dead(arr);
	}

	static void dead(int[] arr) {
		int xor = 0;
		int temp1 = 0, temp2 = 0;

		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		int lastBitOnly = xor & (~(xor - 1));

		for (int i = 0; i < arr.length; i++) {
			if ((lastBitOnly & arr[i]) != 0) {
				temp1 = temp1 ^ arr[i];
			} else
				temp2 = temp2 ^ arr[i];
		}
		System.out.println(temp1);
		System.out.println(temp2);
	}
}
