package arrays;

public class leftRotateDtimes {
	static void lRotateOne(int arr[], int d) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

//    	int temp[] = new int[d];
//    	for(int i = 0; i  < d; i++)
//    	{
//    		temp[i] = arr[i];
//    	}
//    	for(int i = d; i  < arr.length; i++)
//    	{
//    		arr[i - d] = arr[i];
//    	}
//    	for(int i = 0; i  < d; i++)
//    	{
//    		arr[arr.length - d + i] = temp[i];
//    	}	

	}

	static void reverse(int arr[], int low, int high) {
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;

			low++;
			high--;
		}
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 }, n = 5;
		lRotateOne(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
