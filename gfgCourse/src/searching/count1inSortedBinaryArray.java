package searching;

public class count1inSortedBinaryArray {
	public static void main(String args[]) {
		int arr[] = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, n = 11;
		int x = 0;
		System.out.println(countt(arr, n, x));
	}

	static int countt(int[] arr, int n, int x) {

		int base = indexOfLastOccurance.lastOcc(arr, n, x);
		return n - base;
	}
}
