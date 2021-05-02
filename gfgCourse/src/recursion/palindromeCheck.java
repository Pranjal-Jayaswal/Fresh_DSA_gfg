package recursion;

import java.util.Scanner;

public class palindromeCheck {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		int low = 0, high = n.length() - 1;
		boolean ans = palin(n, low, high);
		System.out.println(ans);
	}

	static boolean palin(String n, int low, int high) {
		if (low >= high)
			return true;
		if (n.charAt(low) != n.charAt(high))
			return false;
		return palin(n, ++low, --high);
	}
}
