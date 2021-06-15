package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class dds {
	public static void main(String[] rags) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();

		while (t-- > 0) {
			aa: {
				int n = kb.nextInt(), temp = 0;
				ArrayList<Integer> h1 = new ArrayList<Integer>();
				ArrayList<Integer> h2 = new ArrayList<Integer>();
				ArrayList<Integer> aa = new ArrayList<Integer>();
				ArrayList<Integer> bb = new ArrayList<Integer>();
				ArrayList<Integer> komb = new ArrayList<Integer>();
				for (int i = 0; i < n; i++) {
					temp = kb.nextInt();
					h1.add(temp);
					aa.add(temp);
					komb.add(temp);
				}
				for (int i = 0; i < n; i++) {
					temp = kb.nextInt();
					h2.add(temp);
					bb.add(temp);
					komb.add(temp);
				}
				temp = h1.get(0);
				for (int i = 1; i < h1.size(); i++) {
					temp = h1.get(i) ^ temp;
				}
				for (int i = 0; i < h2.size(); i++) {
					temp = h2.get(i) ^ temp;
				}
				if (temp != 0) {
					System.out.println("-1");
					continue;
				}
				Collections.sort(komb);
				int jjl = komb.get(0);
				for (int i = 0; i < komb.size(); i++) {
					if (i % 2 == 0) {
						jjl = komb.get(i);
					} else {
						if (komb.get(i) != jjl) {
							System.out.println("-1");
							break aa;
						}
					}
				}
				int kl = 0;
				Collections.sort(aa);
				Collections.sort(bb);
				for (int i = 0; i < n; i++) {
					if (aa.get(i) == bb.get(i)) {
						kl++;
					}
				}
				if (kl == n) {
					System.out.println("0");
					continue;
				}

				for (int i = 0; i < n; i++) {
					if (h1.get(i) == -1)
						break;
					if (h2.contains(h1.get(i))) {
						int kjh = h2.indexOf(h1.get(i));
						h1.remove(i);
						h2.remove(kjh);
						h1.add(-1);
						h2.add(-1);
						i--;
					}
				}
				ArrayList<Integer> mismatch = new ArrayList<Integer>();
				ArrayList<Integer> mismatch2 = new ArrayList<Integer>();
				int ii = 0, khk = h1.size();
				while (khk-- > 0) {
					if (h1.get(ii) != -1) {
						mismatch.add(h1.get(ii));
					} else
						break;
					ii++;
				}

				int iii = 0, khkk = h2.size();
				while (khkk-- > 0) {
					if (h2.get(iii) != -1) {
						mismatch2.add(h2.get(iii));
					} else
						break;
					iii++;
				}
				Collections.sort(mismatch);
				Collections.sort(mismatch2);
				int summ = 0;
				for (int i = 0; i < mismatch.size(); i++) {
					summ += Math.min(mismatch.get(i), mismatch2.get(mismatch2.size() - 1 - i));
				}
				System.out.println(summ / 2);
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
