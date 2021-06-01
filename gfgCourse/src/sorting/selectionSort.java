package sorting;

public class selectionSort {
	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 3 };
		selectionSort(a, a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void selectionSort(int[] a, int length) {
		int temp = 0, ans = 0;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			for (int j = i; j < a.length; j++) {
				temp = Math.min(temp, a[j]);
			}
			for (int j = i; j < a.length; j++) {
				if (a[j] == temp) {
					swapp(a, j, i);
					break;
				}
			}
		}
	}

	static void swapp(int[] arr, int j2, int i) {
		int temp = arr[j2];
		arr[j2] = arr[i];
		arr[i] = temp;
	}
}
