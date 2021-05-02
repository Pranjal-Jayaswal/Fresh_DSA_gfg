package recursion;

import java.util.Scanner;

public class printNto1 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		printt(n);
	}

	static void printt(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		printt(n - 1);
	}
}
