package searching;

public class indexOfLastOccurance {
	public static void main(String args[]) {
		int arr[] = { 5, 10, 10, 10, 20 }, n = 5;
		int x = 10;
		System.out.println(lastOcc(arr, n, x));
	}

	public static int lastOcc(int[] arr, int high, int x) {
		int low = 0;
		high--;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else if (arr[mid + 1] != arr[mid] || mid == 0) {
				return mid;
			} else
				low = mid + 1;
		}
		return -1;
	}
}
