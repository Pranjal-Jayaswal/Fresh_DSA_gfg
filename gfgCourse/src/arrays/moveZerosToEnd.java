package arrays;

public class moveZerosToEnd {
//	READ
//	READ
//	READ
//	READ
//	READ
//	READ
//	READ
//	READ
//	READ
//	READ
//	READ

	public static void main(String args[]) {
		int[] arr = { 23, 0, 214, 0, 0, 0, 25, 26, 0, 27, 0 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				swap(arr, i, count);
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void swap(int[] arr, int i, int count) {
		int temp1 = 0;
		temp1 = arr[i];
		arr[i] = arr[count];
		arr[count] = temp1;
	}
}
