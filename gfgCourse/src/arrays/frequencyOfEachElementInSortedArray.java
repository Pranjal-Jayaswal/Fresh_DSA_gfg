package arrays;

public class frequencyOfEachElementInSortedArray {
	public static void main(String args[]) {
		int[] arr = { 10, 10, 20, 30, 30, 30 };
		freqq(arr);
	}

	private static void freqq(int[] arr) {
		int freq = 1, temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == temp)
				freq++;
			else {
				System.out.println(temp + " appeared " + freq + " times");
				freq = 1;
				temp = arr[i];
			}
//			read
//			read
//			read
//			read//			read
//			read
			if (i == arr.length - 1) {
				System.out.println(temp + " appeared " + freq + " times");
			}
		}
	}

}
