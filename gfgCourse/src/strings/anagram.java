package strings;

public class anagram {
//	read//	read
//	read
//	read
//	read
//	read
//	read

	static boolean areAnagram(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		int[] count = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}

		for (int i = 0; i < 256; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		String str1 = "abaac";
		String str2 = "aacba";
		if (areAnagram(str1, str2))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
