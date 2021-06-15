package codechef;

import java.util.Scanner;

public class chef1 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		while (t-- > 0) {
			int n = kb.nextInt();
			int m = kb.nextInt();
			int x = kb.nextInt();
			int ans = 10 * (m + ((100 - n) * x));
			System.out.println(ans);
		}
	}
}
