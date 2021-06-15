package codechef;

import java.util.Scanner;

public class forces3 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		while (t-- > 0) {
			int size = kb.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = kb.nextInt();
			}
			int c = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if ((j - i) == arr[j] - arr[i]) {
						c++;
					}
				}
			}
			System.out.println(c);
		}
	}
}
