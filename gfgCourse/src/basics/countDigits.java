package basics;

import java.util.Scanner;

public class countDigits {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
//		int ans = 0;
//		while (n > 0) {
//			ans++;
//			n = n / 10;
//		}
//		System.out.println(ans);
		int ans = (int) Math.log10(n) + 1;
		System.out.println(ans);

	}
}
