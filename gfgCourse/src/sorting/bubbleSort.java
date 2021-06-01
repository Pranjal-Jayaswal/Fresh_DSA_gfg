package sorting;

public class bubbleSort {
	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 3, 5, 5, 5, 5, 5, 5, 43, 555, 3, 33, 4, 3 };
		bubbleSort(a, a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void bubbleSort(int[] arr, int i) {
		boolean flag = false;
		for (int j = 0; j < arr.length; j++) {
			flag = false;
			for (int j2 = 0; j2 < arr.length - 1; j2++) {
				if (arr[j2] > arr[j2 + 1]) {
					swapp(arr, j2, j2 + 1);
					flag = true;
				}
			}
			if (flag == false)
				break;
		}
	}

	static void swapp(int[] arr, int j2, int i) {
		int temp = arr[j2];
		arr[j2] = arr[j2 + 1];
		arr[j2 + 1] = temp;
	}
}
