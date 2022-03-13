/**
 * find the sum of the gp series
 *
 * */

package tkufrwrdlst;

import io.IO;

public class NumberQ11 extends IO {
	public static void main(String[] args) {
		int a = in.nextInt();
		int r = in.nextInt();
		int n = in.nextInt();
		out.println(gpSum(a, r, n));
		out.println(gpSum(a, r, n, 'b'));

	}

	static long gpSum(int a, int r, int n) {
		long sum = 0, dgt = a;
		while (n > 0) {
			sum += dgt;
			dgt = dgt * r;
			n--;
		}
		return sum;
	}

	static long gpSum(int a , int r, int n, char c) {
		return a * ((long)Math.pow(r, n) - 1) / (r - 1);
	}
}