package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mayLong_GOLF {
	public static void main(String args[]) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {

			int N = kb.nextInt();
			int x = kb.nextInt();
			int k = kb.nextInt();

			if (x % k == 0) {
				System.out.println("YES");
				continue;
			}
			if (((N + 1) - x) % k == 0) {
				System.out.println("YES");
				continue;
			}
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
