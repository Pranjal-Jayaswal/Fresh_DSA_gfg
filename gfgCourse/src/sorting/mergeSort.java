package sorting;

class mergeSort {
//	write story
//	write story
//	write story
//	write story
//	write story
//	write story

	public static void main(String[] args) {
		int a[] = new int[] { 10, 5, 30, 15, 7 };

		mergeSort(a, 0, a.length - 1);
		for (int x : a)
			System.out.print(x + " ");
	}

	static void merge(int arr[], int low, int m, int high) {

		int n1 = m, n2 = high - m;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = low; i < n1; i++)
			left[i] = arr[i];
		for (int j = m + 1; j < n2; j++)
			right[j] = arr[j];

		int i = 0, j = 0, k = low;

		while (i < n1 && j < n2) {

			if (left[i] <= right[j]) {
				arr[k] = left[i];
				k++;
				i++;
			} else {
				arr[k++] = right[j++];
				k++;
				j++;
			}
		}
		while (i < n1)
			arr[k++] = left[i++];
		while (j < n2)
			arr[k++] = right[j++];
	}

	static void mergeSort(int arr[], int l, int r) {
		if (r > l) {
			int m = l + (r - l) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}
}
