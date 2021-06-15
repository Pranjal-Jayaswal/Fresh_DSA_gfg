package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class tree2 {
	public static void main(String[] args) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {
			int n = kb.nextInt(), temp = 0;
			int[] tree = new int[n];
			int jj = n;
			while (n-- > 0) {
				temp = kb.nextInt();
				tree[n] = temp;
			}
			Arrays.sort(tree);
			System.out.println(Arrays.toString(tree));
			int count = 0, result = 0, store = 0;
			for (int i = jj - 1; i > 0; i--) {
				if (tree[i] - tree[i - 1] == 0) {
					count++;
					continue;
				} else if (count == 0) {
					result++;
					tree[i] = tree[i - 1];
				} else {
					store = tree[i] - tree[i - 1];
					for (int k = i; k >= (count + i); k++) {
						tree[k] -= store;
					}
					count = 0;
					result++;
				}
			}
			if (tree[0] == 0) {
				System.out.println(result);
			} else
				System.out.println(result + 1);
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
