package codechef;

import java.util.HashSet;
import java.util.Scanner;

public class covid19b {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		while (t-- > 0) {
			int a = kb.nextInt();
			HashSet<Integer> h = new HashSet<Integer>(2);
			int temp = 0, flag = 0, count = -1;
			while (a-- > 0) {
				count++;
				temp = kb.nextInt();
				if (!h.contains(temp)) {
					h.add(temp);
					flag++;
					if (flag == 1) {
						System.out.println(count);
					}
				}
			}

		}
	}
}
