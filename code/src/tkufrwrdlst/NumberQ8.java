/**
 * check wether the number is positive or negative
 * */

package tkufrwrdlst;

import io.IO;

public class NumberQ8 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();

		out.println(isPositive(n) ? "positive" : "negative");
		out.println(isPositive(n, 'b') ? "positive" : "negative");
		out.println(isPositive(n, 2) ? "positive" : "negative");


	}

	static boolean isPositive(int n) {
		return n > 0;
	}

	static boolean isPositive(int n, char ch) {
		return (n >> (Integer.SIZE - 1)) == 0;
	}

	static boolean isPositive(int n, int b) {
		return (~n) < n;
	}
}