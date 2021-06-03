package strings;

import java.util.Arrays;

public class leftMostNONrepeatingChar {
	static int nonRep(String str) {
		int[] arrCHAR = new int[256];
		Arrays.fill(arrCHAR, -1);

		for (int i = 0; i < str.length(); i++) {
			if (arrCHAR[str.charAt(i)] == -1)
				arrCHAR[str.charAt(i)] = i;
			else
				arrCHAR[str.charAt(i)] = -2;
		}
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < 2; i++) {
			if (arrCHAR[i] >= 0)
				res = Math.min(res, arrCHAR[i]);
		}
		return (res == Integer.MAX_VALUE) ? -1 : res;
	}

	public static void main(String args[]) {
		String str = "geeksforgeeks";
		System.out.println("Index of leftmost non-repeating element:");
		System.out.println(nonRep(str));
	}
}
