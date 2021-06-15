package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class june10fff {
	public static void main(String[] args) {
		FastReader kb = new FastReader();
		int n = kb.nextInt();
		System.out.println(n);
		int tr = n / 2;
		for (int i = 0; i < 36; i++) {
			char temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8;
			int countG = 0, countL = 0;

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
			System.out.println(n);

			if (temp1 == 'G') {
				countG++;
			} else
				countL++;
			if (temp2 == 'G') {
				countG++;
			} else
				countL++;
			if (temp3 == 'G') {
				countG++;
			} else
				countL++;
			if (temp4 == 'G') {
				countG++;
			} else
				countL++;
			if (temp5 == 'G') {
				countG++;
			} else
				countL++;
			if (temp6 == 'G') {
				countG++;
			} else
				countL++;
			if (temp7 == 'G') {
				countG++;
			} else
				countL++;
			if (temp8 == 'G') {
				countG++;
			} else
				countL++;

			if (countG > countL) {
				n = n + tr;
				System.out.println(n);
			} else {
				n = n - tr;
				System.out.println(n);
			}
			if (tr != 1) {
				tr /= 2;
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
