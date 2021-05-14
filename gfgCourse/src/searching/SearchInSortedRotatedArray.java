package searching;

public class SearchInSortedRotatedArray {
	// readddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
	public static void main(String args[]) {
		int arr[] = { 10, 20, 40, 60, 5 }, n = 5;
		int x = 5, low = 0;

		System.out.println(callMTD(arr, low, n, x));
	}

	private static int callMTD(int[] arr, int low, int high, int x) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > arr[low]) {
				if (x > arr[low] && x < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else if (arr[mid] < arr[low]) {
				if (x > arr[mid] && x < arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
}
