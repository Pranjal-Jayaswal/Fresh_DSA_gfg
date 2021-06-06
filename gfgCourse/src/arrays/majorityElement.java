package arrays;

public class majorityElement {
	public static void main(String args[]) {
		int arr[] = { 8, 8, 6, 6, 6, 4, 6 }, n = 7;
		System.out.println(findMajority(arr, n));
	}

	static int findMajority(int arr[], int n) {

//		this commented wont work 
//		read
//		read

//		int temp = arr[0], count = 1, ans = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] == temp)
//				++count;
//			else {
//				--count;
//			}
//			if (count == 0) {
//				count = 1;
//				temp = arr[i];
//				ans = arr[i];
//			}
//			System.out.println(ans);
//
//			System.out.println(count);
//			System.out.println(temp);
//			System.out.println();
//		}
//
//		if (count <= arr.length / 2)
//			return -1;
//
//		return ans;
		int res = 0, count = 1;
		for (int i = 1; i < n; i++) {
			if (arr[res] == arr[i])
				count++;
			else
				count--;
			if (count == 0) {
				res = i;
				count = 1;
			}
		}
		count = 0;
		for (int i = 0; i < n; i++)
			if (arr[res] == arr[i])
				count++;
		if (count <= n / 2)
			res = -1;
		return res;
	}

}
