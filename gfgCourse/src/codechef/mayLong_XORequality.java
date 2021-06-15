package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mayLong_XORequality {
	public static void main(String args[]) {
		int m = (int) (Math.pow(10, 9) + 7);
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {
			int N = kb.nextInt();
			long temp = (Power(2, N - 1));

			System.out.println(temp);
		}
	}

	static long m = (long) 1e9 + 7;

	public static long Power(int n, int y) {
		if (y == 0) {
			return 1;
		}
		if (y == 1) {
			return n;
		}
		long res = Power(n, y / 2);
		res *= res;
		if (y % 2 == 1) {
			res *= n;
		}
		return res % m;
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
