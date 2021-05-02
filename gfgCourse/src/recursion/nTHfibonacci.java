package recursion;

import java.util.Scanner;

public class nTHfibonacci {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int ans = fib(n);
		System.out.println(ans);
	}

	static int fib(int n) {
		if (n == 0 || n == 1)
			return n;
		return (fib(n - 1) + fib(n - 2));
	}
}
