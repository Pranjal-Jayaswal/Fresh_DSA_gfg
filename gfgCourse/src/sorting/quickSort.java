package sorting;

class Solution {
//	write story
//	write story
//	write story
//	write story
//	write story
//	write story
//	tail call elimination sample
	public static void main(String[] args) {
		int arr[] = new int[] { 8, 4, 7, 9, 3, 10, 5 };
		qSort(arr, 0, arr.length - 1);

		for (int x : arr)
			System.out.print(x + " ");

	}

	static int iPartition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	static void qSort(int arr[], int l, int h) {
		if (l < h) {
			int p = iPartition(arr, l, h);
			qSort(arr, l, p - 1);
			qSort(arr, p + 1, h);
		}
	}
}
