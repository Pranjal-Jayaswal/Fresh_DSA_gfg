package recursion;

import java.util.Scanner;

public class sumOfDigitsOfaNum {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int ans = summ(n);
		System.out.println(ans);
	}

	static int summ(int n) {
		if (n < 10)
			return n;
		return (n % 10) + summ(n / 10);
	}
}
