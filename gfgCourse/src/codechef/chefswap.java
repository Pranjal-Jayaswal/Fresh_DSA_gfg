package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chefswap {
	public static void main(String[] args) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {
			aa: {
				int n = kb.nextInt();
				int arr[] = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = i + 1;
				}
				int sum1 = 0, sum2 = 0, temp = 0;

				for (int i = (n / 2) - 1; i < n; i++) {
//					for (int element : arr) {
//						System.out.println(element);
//					}
					sum1 = 0;
					sum2 = 0;
					temp = arr[i];
					arr[i] = arr[n - 1];
					arr[n - 1] = temp;
					// System.out.println("aa");
//					for (int element : arr) {
//						System.out.println(element);
//					}
					for (int ii = 0; ii < n; ii++) {
						// System.out.println("bb");
						if (ii <= i)
							sum1 += arr[ii];
						else
							sum2 += arr[ii];

					}
					if (sum1 == sum2) {
						System.out.println(i + 1);
						break aa;
					}

					for (int ijk = n / 2; ijk < n; ijk++) {
						sum1 = 0;
						sum2 = 0;
						for (int ii = 0; ii < n; ii++) {
							// System.out.println("bb");
							if (ii <= ijk)
								sum1 += arr[ii];
							else
								sum2 += arr[ii];
						}
						if (sum1 == sum2) {
							System.out.println(i + 1);
							break aa;
						}
					}
					// System.out.println(sum1 + " ddddd " + sum2);

					temp = arr[n - 1];
					arr[n - 1] = arr[i];
					arr[i] = temp;

				}
				for (int i = 0; i < n / 2; i++) {
//					for (int element : arr) {
//						System.out.println(element);
//					}
					sum1 = 0;
					sum2 = 0;
					temp = arr[i];
					arr[i] = arr[0];
					arr[0] = temp;
					// System.out.println("aa");
//					for (int element : arr) {
//						System.out.println(element);
//					}
					for (int ii = 0; ii < n; ii++) {
						// System.out.println("bb");
						if (ii <= i)
							sum1 += arr[ii];
						else
							sum2 += arr[ii];

					}
					if (sum1 == sum2) {
						System.out.println(i + 1);
						break aa;
					}

					for (int ijk = 0; ijk < n / 2; ijk++) {
						sum1 = 0;
						sum2 = 0;
						for (int ii = 0; ii < n; ii++) {
							// System.out.println("bb");
							if (ii <= ijk)
								sum1 += arr[ii];
							else
								sum2 += arr[ii];
						}
						if (sum1 == sum2) {
							System.out.println(i + 1);
							break aa;
						}
					}
					// System.out.println(sum1 + " ddddd " + sum2);

					temp = arr[n - 1];
					arr[n - 1] = arr[i];
					arr[i] = temp;

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
