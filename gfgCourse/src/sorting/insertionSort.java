package sorting;

public class insertionSort {
//	read.....
//	read.....
//	read.....
//	read.....
//	read.....
//	read.....
//	read.....
//	read.....

//	compareToPrevious........................................................................................
//	compareToPrevious.........................................................................................

//	compareToPrevious.........................................................................................
	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 3, 436657, 88, 865856, 8, 65, 45, 6, 3565455, 42 };
		insertionSort(a, a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void insertionSort(int arr[], int n) {

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
