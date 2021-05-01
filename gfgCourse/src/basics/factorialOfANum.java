package basics;

import java.util.Scanner;

public class factorialOfANum {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int ans = fact(n);
		System.out.println(ans);
	}

	static int fact(int n) {
		if (n < 2)
			return 1;
		return n * fact(n - 1);
	}
}
