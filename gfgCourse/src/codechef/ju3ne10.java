package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ju3ne10 {
	public static void main(String[] args) {
		FastReader kb = new FastReader();
		char temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8;
		String only_true;
		char tt;
		int n = kb.nextInt();
		System.out.println(n);
		temp1 = kb.next().charAt(0);
		if (temp1 == 'E') {
			System.exit(0);
		}
		System.out.println(n);
		temp2 = kb.next().charAt(0);
		if (temp2 == 'E') {
			System.exit(0);
		}
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
		int tr = 0;
		if (only_true == "odd") {
			n = n / 2;
			tr = n / 2;
			System.out.println(n);
			for (int i = 0; i < 292; i++) {
				tt = kb.next().charAt(0);
				if (tt == 'E') {
					System.exit(0);
				} else if (tt == 'G') {
					n = n + tr;
					System.out.println(n);
				} else if (tt == 'L') {
					n = n - tr;
					System.out.println(n);
				}
				if (tr != 1) {
					tr /= 2;
				}
				tt = kb.next().charAt(0);
				if (tt == 'E') {
					System.exit(0);
				}
				System.out.println(n);
			}
		} else if (only_true == "even") {
			n = n / 2;
			System.out.println(n);

			tt = kb.next().charAt(0);
			if (tt == 'E') {
				System.exit(0);
			}
			System.out.println(n);
			tr = n / 2;
			for (int i = 0; i < 292; i++) {
				tt = kb.next().charAt(0);
				if (tt == 'E') {
					System.exit(0);
				} else if (tt == 'G') {
					n = n + tr;
					System.out.println(n);
				} else if (tt == 'L') {
					n = n - tr;
					System.out.println(n);
				}

				if (tr != 1) {
					tr /= 2;
				}
				tt = kb.next().charAt(0);
				if (tt == 'E') {
					System.exit(0);
				}
				System.out.println(n);
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
