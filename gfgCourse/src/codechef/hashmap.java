package codechef;

import java.util.HashMap;

public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer, Integer> x = new HashMap<Integer, Integer>();
		x.put(1, 6);
		x.put(2, 7);
		x.put(3, 8);
		x.put(4, 9);
		x.put(5, 10);
		System.out.println(x.toString());

		String s = x.values().toString();
		String ss = x.keySet().toString();
		int a[] = x.values().toString();
		System.out.println(s.concat(ss));
	}
}
