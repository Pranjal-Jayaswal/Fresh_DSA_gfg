package arrays;

public class trappingRainWater {
	public static void main(String args[]) {
		int[] arr = { 5, 0, 6, 2, 3 };
		trap(arr);
	}

	private static void trap(int[] arr) {
		int lMax[] = new int[arr.length];
		int rMax[] = new int[arr.length];
		lMax[0] = arr[0];
		int left = arr[0], right = arr[arr.length - 1];
		for (int i = 1; i < rMax.length; i++) {
			if (arr[i] > left) {
				lMax[i] = arr[i];
				left = arr[i];
			} else
				lMax[i] = left;
		}
		rMax[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > right) {
				rMax[i] = arr[i];
				right = arr[i];
			} else
				rMax[i] = right;
		}
		int stored = 0;
		right = 0;
		for (int i = 0; i < rMax.length; i++) {
			right = Math.min(lMax[i], rMax[i]) - arr[i];
			if (right > 0)
				stored += right;
		}
		System.out.println(stored);
		for (int i = 0; i < rMax.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < rMax.length; i++) {
			System.out.print(lMax[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < rMax.length; i++) {
			System.out.print(rMax[i] + " ");
		}
		System.out.println();
	}
}
