/**
 * prime numbers in a given range
 *
 * */


package tkufrwrdlst;

import io.IO;

public class NumberQ4 extends IO {
	public static void main(String[] args) {
		int l = in.nextInt();
		int r = in.nextInt();
		printPrimes(l, r);
	}

	public static void printPrimes(int l, int r) {
		while (l <= r) {
			if (isPrime(l)) {
				out.println(l);
			}
			l++;
		}
	}

	public static boolean isPrime(int n ) {
		if (n == 1 || n == 2) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) { return false; }
		}
		return true;
	}
}