package basics;

import java.util.Scanner;

public class palindromeNumber {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		boolean ans = palin(n);
		System.out.println(ans);
	}

	static boolean palin(int n) {
		int rev = 0;

		int temp = n;
		while (temp != 0) {
			int ld = temp % 10;

			rev = rev * 10 + ld;

			temp = temp / 10;
		}

		return rev == n;
//		int rev = 0;
//		int dup = n;
//		int i = 1;
//		while (dup != 0) {
//
//			rev = (rev * i) + (dup % 10);
//			dup /= 10;
//			i = 10;
//		}
//		System.out.println(rev);
//		return (rev == n);
	}
}
