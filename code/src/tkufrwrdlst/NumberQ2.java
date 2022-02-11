/**
 * given a range from l to r
 * find all the pallindrome numbers
 * in between
 * */

package tkufrwrdlst;

import io.IO;

public class NumberQ2 extends IO {
	public static void main(String[] args) {
		int l = in.nextInt();
		int r = in.nextInt();

		optimized(l, r);
		out.println();
		while (l < r) {
			int temp = l;
			int ndgt = 0;

			while (temp > 0) {
				int dgt = temp % 10;
				ndgt = dgt + ndgt * 10;
				temp /= 10;
			}
			if (ndgt == l) {
				out.print(l + " ");
			}

			l++;
		}
	}

	static void optimized(int l, int r) {
		int cnt = (int)Math.log10(l) + 1;
		int frst  = 0;

		while (l < r) {
			int temp = l;
			int ndgt = 0;

			while (temp > 0) {
				int dgt = temp % 10;
				ndgt = dgt + ndgt * 10;
				temp /= 10;
			}
			if (ndgt == l) {
				frst = ndgt;
				break;
			}

			l++;
		}
		while (frst < r) {
			out.print(frst + " ");
			frst += ((int)Math.pow(10, cnt - 2) + 10);
		}
	}
}