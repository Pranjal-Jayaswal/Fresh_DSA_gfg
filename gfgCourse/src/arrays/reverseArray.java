package arrays;

public class reverseArray {
	public static void main(String args[]) {
//		Scanner kb = new Scanner(System.in);
//		int n = kb.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = kb.nextInt();
//		}
		int[] arr = { 23, 24, 25, 26, 27 };

		int low = 0, high = arr.length - 1, temp1 = 0;
		while (low <= high) {
			temp1 = arr[low];
			arr[low] = arr[high];
			arr[high] = temp1;
			low++;
			high--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}