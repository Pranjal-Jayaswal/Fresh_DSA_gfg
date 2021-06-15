package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class juneTuple2 {

	public static void main(String[] args) {
		FastReader kb = new FastReader();
		int t = kb.nextInt();
		while (t-- > 0) {
			float i1 = kb.nextInt(), i2 = kb.nextInt(), i3 = kb.nextInt(), d1 = kb.nextInt(), d2 = kb.nextInt(),
					d3 = kb.nextInt(), tt = 0, count = 0, gg = 0;

			if (d1 == i1 && d2 == i2 && d3 == i3) {
				System.out.println("0");
				continue;
			}
			if ((d1 == i1 && d2 == i2) || (d1 == i1 && d3 == i3) || (d3 == i3 && d2 == i2)) {
				System.out.println("1");
				continue;
			}

			if (d1 - i1 == d2 - i2 && d3 - i3 == d2 - i2) {
				System.out.println("1");
				continue;
			}
			if (d1 / i1 == d2 / i2 && d3 / i3 == d2 / i2) {
				System.out.println("1");
				continue;
			}
			if (d1 - i1 == d2 - i2) {
				tt = 1;
			}
			if (d2 - i2 == d3 - i3) {
				tt = 2;
			}
			if (d1 - i1 == d3 - i3) {
				tt = 3;
			}

			if (tt == 1) {
				if (i3 != d3) {
					count += 2;
				} else
					count++;
				System.out.println("11111111111");
				System.out.println((int) count);
				continue;
			}
			if (tt == 2) {
				if (i1 != d1) {
					count += 2;
				} else
					count++;

				System.out.println("222222222222");
				System.out.println((int) count);
				continue;
			}
			if (tt == 3) {
				if (i2 != d2) {
					count += 2;
				} else
					count++;

				System.out.println("33333333333");
				System.out.println((int) count);
				continue;
			}

			if (d1 / i1 == d2 / i2) {
				gg = 1;
			}
			if (d3 / i3 == d2 / i2) {
				gg = 2;
			}
			if (d1 / i1 == d3 / i3) {
				gg = 3;
			}

			if (gg == 1) {
				if (i3 != d3) {
					count += 2;
				} else
					count++;

				System.out.println("444444444444");
				System.out.println((int) count);
				continue;
			}
			if (gg == 2) {
				if (i1 != d1) {
					count += 2;
				} else
					count++;

				System.out.println("5555555555");
				System.out.println((int) count);
				continue;
			}
			if (gg == 3) {
				if (i2 != d2) {
					count += 2;
				} else
					count++;

				System.out.println("f6666666666f");
				System.out.println((int) count);
				continue;
			}

			if (i1 == d1 || i2 == d2 || i3 == d3) {
				System.out.println("777777777777");
				System.out.println("2");
				continue;
			}
			float xx = Math.max(d1 - i1, d2 - i2);
			float yy = Math.max(xx, d3 - i3);
			if (yy == d3 - i3) {
				if (d3 == (d1 / i1) * (d2 / i2) * i2) {
					System.out.println("88888888888888888");
					System.out.println("2");
					continue;
				}
			}
			if (yy == d2 - i2) {
				if (d2 == (d1 / i1) * (d3 / i3) * i2) {
					System.out.println("99999999999999999");
					System.out.println("2");
					continue;
				}
			}
			if (yy == d1 - i1) {
				if (d1 == (d3 / i3) * (d2 / i2) * i1) {
					System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
					System.out.println("2");
					continue;
				}
			}

			float x = Math.min(d1 - i1, d2 - i2);
			float y = Math.min(x, d3 - i3);

			if (y == d3 - i3) {
				float hj = Math.min(d1 - i1, d2 - i2);
				if (hj == d1 - i1) {
					if (d2 == ((d1 / i1) * i2) + y) {
						System.out.println("bbbbbbbbbbbbbbbbbbbbb");
						System.out.println("2");
						continue;

					}
				} else {
					if (d1 == ((d2 / i2) * i1) + y) {
						System.out.println("cccccccccccccccccccc");
						System.out.println("2");
						continue;
					}
				}
			}
			if (y == d2 - i2) {
				float hj = Math.min(d1 - i1, d3 - i3);
				if (hj == d1 - i1) {
					if (d3 == ((d1 / i1) * i3) + y) {
						System.out.println("ddddddddddddddddddd");
						System.out.println("2");
						continue;

					}
				} else {
					if (d1 == ((d3 / i3) * i1) + y) {
						System.out.println("eeeeeeeeeeeeeeee");
						System.out.println("2");
						continue;
					}
				}
			}
			if (y == d1 - i1) {
				float hj = Math.min(d2 - i2, d3 - i3);
				if (hj == d2 - i2) {
					if (d3 == ((d2 / i2) * i3) + y) {
						System.out.println("fffffffffffffffffffff");
						System.out.println("2");
						continue;

					}
				} else {
					if (d2 == ((d3 / i3) * i2) + y) {
						System.out.println("gggggggggggg");
						System.out.println("2");
						continue;
					}
				}
			}
//			System.out.println("..................................................................");
			if (y == d3 - i3) {
				if (d2 - i2 > d1 - i1) {
					if (d2 == ((i2 + y) * (d1 / i1))) {
						System.out.println("hhhhhhhhhhhhhhhhhh");
						System.out.println("2");
						continue;
					}
				} else {
					if (d1 == ((i1 + y) * (d2 / i2))) {
						System.out.println("iiiiiiiiiiiiiiiiii7");
						System.out.println("2");
						continue;
					}
				}
			}
			if (y == d2 - i2) {
				if (d3 - i3 > d1 - i1) {
					if (d3 == ((i3 + y) * (d1 / i1))) {
						System.out.println("jjjjjjjjjjjjjjjj");
						System.out.println("2");
						continue;
					}
				} else {
					if (d1 == ((i1 + y) * (d3 / i3))) {
						System.out.println("kkkkkkkkkkkkkkkkk");
						System.out.println("2");
						continue;
					}
				}
			}
			if (y == d1 - i1) {
				if (d3 - i3 > d2 - i2) {
					if (d3 == ((i3 + y) * (d2 / i2))) {
						System.out.println("lllllllllllllllllllll");
						System.out.println("2");
						continue;
					}
				} else {
					if (d2 == ((i2 + y) * (d3 / i3))) {
						System.out.println("mmmmmmmmmmmmmmmmmmmmm");
						System.out.println("2");
						continue;
					}
				}
			}

//			System.out.println("..................................................................");

//			System.out.println("..................................................................");
			if (y == d1 - i1) {
				if (d2 - i2 > d3 - i3) {
					if (d3 - i3 == (d2 - (i2 + y))) {
						System.out.println("2");

						System.out.println("1111111111111ggggggggggg");
						continue;
					}

				} else {
					if (d2 - i2 == (d3 - (i3 + y))) {
						System.out.println("2");

						System.out.println("22222222222222hhhhhhhhhhh");
						continue;
					}

				}

			} else if (y == d2 - i2) {
				if (d1 - i1 > d3 - i3) {
					if (d3 - i3 == (d1 - (i1 + y))) {
						System.out.println("2");

						System.out.println("i333333333333iiiiiiiiiii");
						continue;
					}

				} else {
					if (d1 - i1 == (d3 - (i3 + y))) {
						System.out.println("2");

						System.out.println("jjjj4444444444444444jjjjjj");
						continue;
					}

				}
			} else if (y == d3 - i3) {
				if (d1 - i1 > d2 - i2) {
					if (d2 - i2 == (d1 - (i1 + y))) {
						System.out.println("2");

						System.out.println("kkkkk55555555555555kkkkkkkk");
						continue;
					}

				} else {
					if (d1 - i1 == (d2 - (i2 + y))) {
						System.out.println("2");

						System.out.println("lllllll66666666666666lllllll");
						continue;
					}

				}
			}
			// System.out.println("..................................................................");
			if (y == d1 - i1) {
				if (d2 - i2 > d3 - i3) {
					if (d3 / i3 == (d2 / (i2 + y))) {
						System.out.println("2");

						System.out.println("ggggg777777777777777777gggggg");
						continue;
					}

				} else {
					if (d2 / i2 == (d3 / (i3 + y))) {
						System.out.println("2");

						System.out.println("hhhh88888888888888888888hhhhhhh");
						continue;
					}

				}

			} else if (y == d2 - i2) {
				if (d1 - i1 > d3 - i3) {
					if (d3 / i3 == (d1 / (i1 + y))) {
						System.out.println("2");

						System.out.println("iiiiiii999999999999999999999iiiii");
						continue;
					}

				} else {
					if (d1 / i1 == (d3 / (i3 + y))) {
						System.out.println("2");
						System.out.println("jjjjaaaaaaaaaaaaaaaaaaaaajjjjjj");
						continue;
					}

				}
			} else if (y == d3 - i3) {
				if (d1 - i1 > d2 - i2) {
					if (d2 / i2 == (d1 / (i1 + y))) {
						System.out.println("2");
						System.out.println("kkkkkkbbbbbbbbbbbbbbbbbbbbbbbkkkkkkk");
						continue;
					}

				} else {
					if (d1 / i1 == (d2 / (i2 + y))) {
						System.out.println("2");
						System.out.println("llllllccccccccccccccccccccllllllll");
						continue;
					}

				}
			}

			System.out.println("3");
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
