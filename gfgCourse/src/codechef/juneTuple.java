package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class juneTuple {

	public static void main(String[] args) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {
			int i1 = kb.nextInt(), i2 = kb.nextInt(), i3 = kb.nextInt(), d1 = kb.nextInt(), d2 = kb.nextInt(),
					d3 = kb.nextInt(), a1 = 0, a2 = 0, a3 = 0, count = 0, y = 0;
			if (d1 - i1 == 0)
				y = Math.min(d2 - i2, d3 - i3);
			else if (d2 - i2 == 0)
				y = Math.min(d1 - i1, d3 - i3);
			else if (d3 - i3 == 0)
				y = Math.min(d1 - i1, d2 - i2);
			else {
				int x = Math.min(d1 - i1, d2 - i2);
				y = Math.min(x, d3 - i3);
			}

			if (y == d1 - i1) {

				i1 += y;
				if (i2 != d2)
					i2 += y;
				if (i3 != d3)
					i3 += y;
			} else if (y == d2 - i2) {

				if (i1 != d1)
					i1 += y;
				i2 += y;
				if (i3 != d3)
					i3 += y;
			} else {

				if (i1 != d1)
					i1 += y;
				if (i2 != d2)
					i2 += y;
				i3 += y;
			}
			count++;
			if (i1 != d1) {
				for (int i = 2; i < 6; i++) {
					if (i1 * i > d1) {
						a1 = i;
						break;
					}
				}
				a1--;
				if (a1 > 1) {
					i1 *= a1;
					count++;
				}
			}

			if (i2 != d2) {
				for (int i = 2; i < 6; i++) {
					if (i2 * i > d2) {
						a2 = i;
						break;
					}
				}
				a2--;
				if (a2 > 1) {
					i2 *= a2;
					if (a2 != a1) {
						count++;
					}
				}
			}

			if (i3 != d3) {
				for (int i = 2; i < 6; i++) {
					if (i3 * i > d3) {
						a3 = i;
						break;
					}
				}
				a3--;
				if (a3 > 1) {
					i3 *= a3;
					if (a3 != a1 && a3 != a2) {
						count++;
					}
				}
			}
			if (i1 != d1) {
				i1 += (d1 - i1);
				count++;
			}
			if (i2 != d2) {
				i2 += (d2 - i2);
				count++;
			}
			if (i3 != d3) {
				i3 += (d3 - i3);
				count++;
			}
			if (count > 3) {
				System.out.println("3");
			} else
				System.out.println(count);
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
