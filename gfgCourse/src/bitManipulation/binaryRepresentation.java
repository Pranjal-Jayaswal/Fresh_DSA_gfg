package bitManipulation;

import java.util.Scanner;

public class binaryRepresentation {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		printt(a);
	}

	static void printt(int n) {
		StringBuilder a = new StringBuilder("");
		while (n != 0) {
			if ((n & 1) == 1) {
				a.append(1);

			} else
				a.append(0);
			n = n / 2;
		}
		a.reverse();
		System.out.println(a);
	}
}