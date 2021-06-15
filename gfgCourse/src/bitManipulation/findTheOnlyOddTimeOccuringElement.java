package bitManipulation;

import java.util.Scanner;

public class findTheOnlyOddTimeOccuringElement {
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
		int xor = arr[0];
		for (int i = 1; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		System.out.println(xor);
	}
}
