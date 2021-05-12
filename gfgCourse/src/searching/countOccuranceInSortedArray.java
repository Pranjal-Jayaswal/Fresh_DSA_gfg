package searching;

public class countOccuranceInSortedArray {
	public static void main(String args[]) {
		int arr[] = { 5, 10, 10, 10, 20 }, n = 5;
		int x = 10;
		System.out.println(countt(arr, n, x));
	}

	static int countt(int[] arr, int n, int x) {
		int base = indexOfFirstOccuranceInSorted.firstOcc(arr, n, x);
		base++;
		int c = 1;
		while (arr[base] == x) {
			c++;
			base++;
		}
		return c;
	}
}
