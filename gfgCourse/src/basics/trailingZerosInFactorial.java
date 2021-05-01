package basics;

import java.util.Scanner;

public class trailingZerosInFactorial {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int ans = zeross(n);
		System.out.println(ans);
	}

	static int zeross(int n) {
		int temp = 0, res = 0, i = 5, sum = 0;
		while (n > i) {
			temp = n / i;
			sum += temp;
			i *= 5;
		}
		return sum;
	}
}
