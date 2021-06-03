package strings;

public class reverseWordsInASentence {
//	read//	read
//	read
//	read
//	read
//	read

	static void reverse(char str[], int low, int high) {
		while (low <= high) {
			char temp = str[low];
			str[low] = str[high];
			str[high] = temp;
			low++;
			high--;
		}
	}

	static void reverseWords(String s) {
		char[] str = s.toCharArray();
		int start = 0, n = str.length;
		for (int end = 0; end < n; end++) {
			if (str[end] == ' ') {
				reverse(str, start, end - 1);
				start = end + 1;
			}
		}
		reverse(str, start, n - 1);
		reverse(str, 0, n - 1);
	}

	public static void main(String args[]) {
		String s = "Welcome to Gfg";
		reverseWords(s);
		System.out.println(s);
	}
}
