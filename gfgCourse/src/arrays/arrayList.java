package arrays;

import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.contains(20));
	}
}
