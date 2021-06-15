package codechef;

import java.util.Scanner;

public class feb1 {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		System.out.println("aaaaaa");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
			if (a % i == 0) {
				System.out.println("bbbb");
				System.out.println(i);
				break;
			}
		}
	}
}
