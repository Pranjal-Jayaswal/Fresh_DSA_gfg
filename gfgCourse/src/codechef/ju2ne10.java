package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ju2ne10 {

	public static void main(String[] args) {
		FastReader kb = new FastReader();
		char temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8;
		String only_true;
		char tt;
		int n = kb.nextInt();
		n = n + 1;
		System.out.println(n);
		temp1 = kb.next().charAt(0);
		System.out.println(n);
		temp2 = kb.next().charAt(0);
		System.out.println(n);
		temp3 = kb.next().charAt(0);
		System.out.println(n);
		temp4 = kb.next().charAt(0);
		System.out.println(n);
		temp5 = kb.next().charAt(0);
		System.out.println(n);
		temp6 = kb.next().charAt(0);
		System.out.println(n);
		temp7 = kb.next().charAt(0);
		System.out.println(n);
		temp8 = kb.next().charAt(0);
		only_true = "od";
		if (temp1 == 'L' && temp3 == 'L' && temp5 == 'L' && temp7 == 'L'
				&& !((temp2 == 'L' && temp4 == 'L') && (temp4 == 'L' && temp8 == 'L'))) {
			only_true = "odd";
		}
		if (temp2 == 'L' && temp4 == 'L' && temp6 == 'L' && temp8 == 'L'
				&& !((temp1 == 'L' && temp3 == 'L') && (temp5 == 'L' && temp7 == 'L'))) {
			only_true = "even";
		}

		n--;
		if (only_true == "odd") {
			n = n / 2;
			System.out.println(n);
			int lkk = 2;
			for (int i = 0; i < 302; i++) {
				tt = kb.next().charAt(0);
				if (tt == 'G') {
					n = n + n / lkk;
					System.out.println(n);
				} else if (tt == 'L') {
					n = n - n / lkk;
					System.out.println(n);
				} else {
					System.exit(0);
				}
				tt = kb.next().charAt(0);
				System.out.println(n);
				lkk += 2;
				tt = kb.next().charAt(0);
				if (tt == 'G') {
					n = n + n / lkk;
					System.out.println(n);
				} else if (tt == 'L') {
					n = n - n / lkk;
					System.out.println(n);
				} else if (tt == 'E') {
					System.exit(0);
				}

			}

		} else if (only_true == "even"){
			System.out.println(n);
			int lk = 2;
			for (int i = 0; i < 302; i++) {

				tt = kb.next().charAt(0);
				System.out.println(n);
				tt = kb.next().charAt(0);
				if (tt == 'G') {
					n = n + n / lk;
					System.out.println(n);
				} else if (tt == 'L') {
					n = n - n / lk;
					System.out.println(n);
				} else if (tt == 'E') {
					System.exit(0);
				}
				lk += 2;
			}
		}
	}

	static class FastReader {

		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
