package sorting;

public class sortAnArrayWith2TypeElement {
//	read
//	read

//	read

//	read

//	read

	public static void main(String[] args) {
		int arr[] = new int[] { 13, -12, 18, -10 };
		sortt(arr, arr.length);

		for (int x : arr)
			System.out.print(x + " ");
	}

	static void sortt(int arr[], int n) {
		int i = -1, j = n;
		while (true) {

			do {
				i++;
			} while (arr[i] < 0);

			do {
				j--;
			} while (arr[j] >= 0);

			if (i >= j)
				return;

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}
	}
}
