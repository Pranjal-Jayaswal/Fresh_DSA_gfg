package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class adamat {
	public static void main(String[] args) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {
			bb: {
				int n = kb.nextInt(), answer = 0;
				int[][] mat = new int[n][n];
				int[][] newmat = new int[n][n];
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						mat[i][j] = kb.nextInt();
						newmat[i][j] = mat[i][j];
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
				for (int k = 0; k < n; k++) {
					cc: {
						if (mat[0][1] == 2) {
							System.out.println("aaaaaaaaaaaaaaa");
							for (int i = 0; i < n; i++) {
								int l = 0;
								for (int j = 0; j < n; j++) {
									if (mat[0][j] != j + 1)
										break;
									if (j == n - 1) {
										System.out.println(answer);
										break bb;
									}
								}
								for (int j = 0; j < n; j++) {
									if (mat[0][j] == j + 1)
										l++;
									else {
										answer++;
										mat = tranpose(mat, l, newmat);
										break cc;
									}
								}
								for (int j = 0; j < n; j++) {
									if (mat[0][j] != j + 1)
										break;
									if (j == n - 1) {
										System.out.println(answer);
										break bb;
									}
								}
								l = 0;
								for (int j = 0; j < n; j++) {
									if (mat[j][0] == j + 1)
										l++;
									else {
										answer++;
										mat = tranpose(mat, l, newmat);
										break cc;
									}
								}
							}
						} else {
							System.out.println("bbbbbbbbbbb");
							int l = 0;
							for (int j = 0; j < n; j++) {
								if (mat[0][j] != j + 1)
									break;
								if (j == n - 1) {
									System.out.println(answer);
									break bb;
								}
							}
							for (int j = 0; j < n; j++) {
								if (mat[j][0] == j + 1)
									l++;
								else {
									answer++;
									mat = tranpose(mat, l, newmat);
									break cc;
								}
							}
							l = 0;
							for (int j = 0; j < n; j++) {
								if (mat[0][j] != j + 1)
									break;
								if (j == n - 1) {
									System.out.println(answer);
									break bb;
								}
							}
							for (int j = 0; j < n; j++) {
								if (mat[0][j] == j + 1)
									l++;
								else {
									answer++;
									mat = tranpose(mat, l, newmat);
									break cc;
								}
							}
						}
					}

					// mat = tranpose(mat, 2, newmat);
					for (int ii = 0; ii < n; ii++) {
						for (int jj = 0; jj < n; jj++) {
							System.out.print(mat[ii][jj] + " ");
						}
						System.out.println();
					}
					System.out.println(answer + "111");
				}
			}
		}
	}

	public static int[][] tranpose(int[][] a, int L, int[][] b) {

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
