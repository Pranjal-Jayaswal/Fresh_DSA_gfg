package bitManipulation;

import java.util.Scanner;

public class countSetBit {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		countt(a);
	}

	static void countt(int n) {
		int count = 0;
		while (n != 0) {
			if (n % 2 != 0)
				count++;
			n /= 2;
		}
		System.out.println(count);
	}
}
