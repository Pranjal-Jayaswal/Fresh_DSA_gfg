package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cook128c_PSGRADE {
	public static void main(String args[]) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {
			int a_m = kb.nextInt();
			int b_m = kb.nextInt();
			int c_m = kb.nextInt();
			int T_m = kb.nextInt();
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			if ((a >= a_m) && (b >= b_m) && (c >= c_m) && ((a + b + c) >= T_m)) {
				System.out.println("YES");
			} else
				System.out.println("NO");
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
