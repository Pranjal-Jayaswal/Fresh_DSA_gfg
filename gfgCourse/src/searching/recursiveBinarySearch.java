package searching;

public class recursiveBinarySearch {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 }, n = 7;
		int x = 40;
		binarySSS(arr, 0, n - 1, x);
	}

	static void binarySSS(int[] arr, int low, int high, int x) {
		int mid = (low + high) / 2;
		if (x > arr[mid]) {
			low = mid + 1;
			binarySSS(arr, low, high, x);
		} else if (x < arr[mid]) {
			high = mid - 1;
			binarySSS(arr, low, high, x);
		} else if (x == arr[mid]) {
			System.out.println(mid);
		}
	}
}
