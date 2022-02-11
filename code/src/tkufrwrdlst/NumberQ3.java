/**
 * given an integer n check either it is prime or not.
 * */
package tkufrwrdlst;

import io.IO;

public class NumberQ3 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int nums = 2;
		// not divisible by any number
		while (nums < n) {
			if (n % nums == 0) {
				out.println("is not prime");
				break;
			}
			nums ++;
		}
		if (nums >= n) {
			out.println("is prime");
		}
		out.println(isprime(n));
	}

	static boolean isprime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}