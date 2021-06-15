package codechef;

import java.util.Scanner;

public class forces2 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		while (t-- > 0) {
			int n = kb.nextInt();
			int ans = 0;
			if (n < 10) {
				ans = n;
			} else {
				int total_digit = (int) (Math.log10(n) + 1);

				ans = (total_digit - 1) * 9;
				int temp = n;
				temp /= Math.pow(10, total_digit - 1);
				StringBuilder s = new StringBuilder();
				while (total_digit-- > 0) {
					s.append(temp);
				}
				int comp = Integer.valueOf(String.valueOf(s));
				if (comp <= n)
					ans += temp;
				else
					ans += (temp - 1);
			}
			System.out.println(ans);
		}
	}
}
