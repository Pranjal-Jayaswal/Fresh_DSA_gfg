package recursion;

import java.util.Scanner;

public class print1toN {
//	study tail call elimination ...and modern compiler optimization 

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		printt(n);
	}

	static void printt(int n) {
		if (n == 0)
			return;
		printt(n - 1);

		System.out.println(n);
	}
}
