package basics;

import java.util.Scanner;

public class primeFactorization {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		set(a);
	}

	static void set(int a) {
		int temp = a;
		while (a % 2 == 0) {
			a /= 2;
			System.out.println(2 + " ");

		}
		while (a % 3 == 0) {
			a /= 3;
			System.out.println(3 + " ");

		}
		for (int i = 5; i * i <= temp; i += 2) {
			while (a % i == 0) {
				a /= i;
				System.out.println(i + " ");
			}

			while (a % (i + 2) == 0) {
				a /= (i + 2);
				System.out.println((i + 2) + " ");

			}

		}

	}
}
