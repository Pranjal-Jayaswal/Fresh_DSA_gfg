package bitManipulation;

import java.util.Scanner;

public class kTHbitSetOrNot {
//	from left
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int k = kb.nextInt();
		checkk(a, k);
	}

	static void checkk(int a, int k) {
		a = a >> (k - 1);
		if ((a & 1) == 1)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
