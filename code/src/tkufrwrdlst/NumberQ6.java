/**
 * check wether a number is perfect or not
 *
 * the sum of the proper divisor is equal to the respective number
 *
 * */

package tkufrwrdlst;

import io.IO;

public class NumberQ6 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		out.println(isPerfect(n));
	}

	static boolean isPerfect(int n) {
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		return sum == n;
	}
}