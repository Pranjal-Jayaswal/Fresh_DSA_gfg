package strings;

public class StringsAreRotationsOfEachOther {
	static boolean areRotations(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		return ((s1 + s1).indexOf(s2) >= 0);
	}

	public static void main(String args[]) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		if (areRotations(s1, s2)) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}
	}
}
