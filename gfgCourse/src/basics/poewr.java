package basics;

import java.util.Scanner;

public class poewr {
//	what is a powered b times a^b.
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();

		int ans = pow(a, b);
		System.out.println(ans);
	}

	static int pow(int a, int b) {
		if (b == 0)
			return 1;
		if (b == 1)
			return a;
		int temp = pow(a, (b / 2));
		temp *= temp;
		if (b % 2 == 0)
			return temp;
		else
			return temp * a;
	}
}
