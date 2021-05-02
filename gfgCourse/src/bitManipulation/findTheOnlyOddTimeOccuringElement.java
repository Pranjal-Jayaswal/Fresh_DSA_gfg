package bitManipulation;

import java.util.Scanner;

public class findTheOnlyOddTimeOccuringElement {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		dead(arr);
	}

	static void dead(int[] arr) {
		int xor = arr[0];
		for (int i = 1; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		System.out.println(xor);
	}
}



int xor = 0, res1 = 0, res2 = 0; 

for (int i = 0; i < n; i++) 
xor = xor ^ arr[i]; 


int sn = xor & (~(xor - 1)); 



for (int i = 0; i < n; i++) 
{ 
    if ((arr[i] & sn) != 0) 
        res1 = res1 ^ arr[i]; 
    else
        res2 = res2 ^ arr[i]; 
} 


System.out.println( res1 + " " + res2);
