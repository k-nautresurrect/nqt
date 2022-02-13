/**
 * find the sum of ap series
 * with given n, a, d;
 * */


package tkufrwrdlst;

import io.IO;

public class NumberQ10 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int a = in.nextInt();
		int d = in.nextInt();

		out.println(SumOfAp(n, a, d));
		out.println(SumOfAp(n, a, d, 'c'));
	}

	static long SumOfAp(int n, int a, int d) {
		int dgt = a;
		long sum = 0;

		while (n > 0) {
			sum += dgt;
			dgt += d;
			n--;
		}
		return sum;
	}

	static long SumOfAp(int n, int a, int d, char c) {
		return (long)(n * ((2 * a) + ((n - 1) * d))) / 2;
	}
}