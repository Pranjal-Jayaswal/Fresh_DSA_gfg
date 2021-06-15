package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class admat2 {
	public static void main(String[] args) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {
			bb: {
				int n = kb.nextInt(), answer = 0;
				int[][] mat = new int[n][n];

				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						mat[i][j] = kb.nextInt();
					}
				}

				for (int j = 0; j < n; j++) {
					if (mat[0][j] != j + 1)
						break;
					if (j == n - 1) {
						System.out.println("0");
						break bb;
					}
				}
				for (int jj = 0; jj < n; jj++) {
					if (mat[jj][0] != jj + 1) {
						break;
					}
					if (jj == n - 1) {
						answer++;
						System.out.println(answer);
						break bb;
					}
				}
				int ttt = 1;
				while (ttt == 1) {
					if (mat[0][1] == 2) {
						int l = 0;
						for (int j = 0; j < n; j++) {
							if (mat[0][j] == j + 1) {
								l++;
							} else {
								answer++;

								mat = tranpose(mat, l, n);
								for (int jj = 0; jj < n; jj++) {
									if (mat[jj][0] != jj + 1) {
										break;
									}
									if (jj == n - 1) {
										answer++;
										System.out.println(answer);
										ttt = 0;
									}
								}
								break;
							}
						}
					} else if (mat[1][0] == 2) {
						int l = 0;
						for (int j = 0; j < n; j++) {
							if (mat[j][0] == j + 1) {
								l++;
							} else {
								answer++;

								mat = tranpose(mat, l, n);

								for (int jj = 0; jj < n; jj++) {
									if (mat[0][jj] != jj + 1)
										break;
									if (jj == n - 1) {
										System.out.println(answer);
										ttt = 0;
									}
								}
								break;
							}
						}
					}
				}
			}
		}
	}

	public static int[][] tranpose(int[][] a, int L, int n) {
		int[][] b = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = a[i][j];
			}
		}
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < L; j++) {
				b[i][j] = a[j][i];
			}
		}
		return b;
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
