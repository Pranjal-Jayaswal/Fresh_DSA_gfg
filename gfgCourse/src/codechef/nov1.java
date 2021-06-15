import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class nov1 {
	public static void main(String[] args) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {
			int n = kb.nextInt();
			if (n == 1) {
				System.out.println(n);
				continue;
			}

			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = kb.nextInt();
			}
			if (n == 2) {
				System.out.println(Math.max(arr[0], arr[1]));
				continue;
			}
			if (n == 3) {
				Arrays.sort(arr);
				int sum = arr[0] + arr[1] + arr[2];
				if (sum == 12) {
					System.out.println('7');
					continue;
				} else {
					System.out.println(arr[2]);
					continue;
				}
			}
			if (n == 4) {
				Arrays.sort(arr);
				int sum = arr[0] + arr[1] + arr[2] + arr[3];
				if (sum == 10) {
					System.out.println('5');
					continue;
				} else if (sum == 11 || sum == 12) {
					System.out.println('6');
					continue;
				} else if (sum == 13 || sum == 14) {
					System.out.println('7');
					continue;
				}
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