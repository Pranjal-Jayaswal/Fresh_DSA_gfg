package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class forces1 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		while (t-- > 0) {
			a: {
				int size = kb.nextInt();
				String str = kb.next();
				ArrayList<String> arrlis = new ArrayList<>(size);
				StringBuilder builder = new StringBuilder(String.valueOf(str.charAt(0)));
				for (int i = 1; i < str.length(); i++) {
					if (str.charAt(i) == builder.charAt(builder.length() - 1)) {
						builder.append(str.charAt(i));
					} else {
						arrlis.add(builder.toString());
						builder.delete(0, builder.length());
						builder.append(str.charAt(i));
					}
					if (i == str.length() - 1) {
						arrlis.add(builder.toString());
					}
				}
				for (int i = 0; i < arrlis.size(); i++) {
					for (int j = i + 1; j < arrlis.size(); j++) {

						if (arrlis.get(i).charAt(0) == arrlis.get(j).charAt(0)) {
							System.out.println("NO");
							break a;
						}
					}
				}
				System.out.println("YES");
			}
		}
	}
}
