package basics;

import java.util.Scanner;

public class checkPrimeOrNot {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		boolean ans = gcd(a);
		System.out.println(ans);
	}

	static boolean gcd(int a) {
		if (a % 2 == 0 || a % 3 == 0)
			return false;
		for (int i = 5; i * i <= a; i += 6) {
			if (a % i == 0 || a % (i + 2) == 0)
				return false;

		}
		return true;
	}
}
