package basics;

import java.util.Scanner;

public class printAllPrimeNoTilln {
//	good question
//	good question
//	good question
//	good question

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		printt(a);
	}

	static void printt(int a) {
		boolean arr[] = new boolean[a + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		for (int i = 2; i * i <= arr.length; i++) {
			if (arr[i]) {
				for (int j = 2 * i; j < arr.length; j += i) {
					arr[j] = false;
				}
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i])
				System.out.println(i);
		}
	}
}
