package basics;

import java.util.Scanner;

public class palindromeNumber {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		palin(n);
	}

	static void palin(int n) {
		int ans = 0;
		int count = (int) Math.log10(n) + 1;
		while (count != 0) {

		}
	}
}
