package searching;

public class sqRootOrFloor {
	public static void main(String args[]) {

		System.out.println(sqRootFloor(10));

	}

	static int sqRootFloor(int i) {
		if (i == 3)
			return 1;
		int low = 0, high = i / 2 + 1, ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if ((mid * mid) == i)
				return mid;
			else if ((mid * mid) > i)
				high = mid - 1;
			else if ((mid * mid) < i) {
				low = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}
}
