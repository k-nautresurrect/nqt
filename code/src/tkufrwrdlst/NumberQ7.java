/**
 * for any number check either it is even or odd
 *
 * */

package tkufrwrdlst;

import io.IO;

public class NumberQ7 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		out.println(isOddEven(n) ? "even" : "odd");
	}

	static boolean isOddEven(int n) {
		return (n & 1) == 0;
	}
}