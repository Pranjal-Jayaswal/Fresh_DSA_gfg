package strings;

import java.util.Scanner;

public class secondisSubseqOfFirstOrNot {
//	read//	read
//	read
//	read
//	read

//	n length string has subsequence===2^n 
//	n length string has subsequence===2^n 
//	n length string has subsequence===2^n 
//	n length string has subsequence===2^n 
//	n length string has subsequence===2^n 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		System.out.println(isSubSeq(s1, s2));
	}

	static boolean isSubSeq(String s1, String s2) {
		int j = 0;
		for (int i = 0; i < s1.length() && j < s2.length(); i++) {
			if (s1.charAt(i) == s2.charAt(j))
				j++;
		}
		return j == s2.length();
	}
}
