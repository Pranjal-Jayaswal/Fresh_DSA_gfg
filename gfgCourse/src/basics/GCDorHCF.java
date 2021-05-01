package basics;

import java.util.Scanner;

public class GCDorHCF {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();

		int ans = gcd(a, b);
		System.out.println(ans);
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
