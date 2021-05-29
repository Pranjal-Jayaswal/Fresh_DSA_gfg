package hashing;

import java.util.HashMap;
import java.util.Map;

public class countFreqOfEachElementInArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 15, 16, 27, 27, 28, 15 };
		int n = arr.length;
		countFreq(arr, n);
	}

	static void countFreq(int[] arr, int n) {
		HashMap<Integer, Integer> h = new HashMap<>();
		for (int j = 0; j < arr.length; j++) {
			if (h.containsKey(arr[j])) {
				h.replace(arr[j], h.get(arr[j]) + 1);
			} else
				h.put(arr[j], 1);
		}

		for (Map.Entry<Integer, Integer> entry : h.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//		// using keySet() for iteration over keys
//		for (int name : h.keySet())
//			System.out.println("key: " + name);
//
//		// using values() for iteration over values
//		for (int url : h.values())
//			System.out.println("value: " + url);
//		
//		
//		key: 16
//		key: 27
//		key: 28
//		key: 15
//		value: 1
//		value: 2
//		value: 1
//		value: 2

	}
}
