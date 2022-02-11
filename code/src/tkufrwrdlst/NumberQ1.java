/**
 * check if number is pallindrome or not
 * */
package tkufrwrdlst;

import io.IO;

public class NumberQ1 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		int temp = n;
		int dgt = 0;
		int ndgt = 0;

		while (temp > 0) {
			dgt = temp % 10;
			// 1234
			ndgt = dgt + ndgt * 10;
			// 0 + 4 -> 40 + 3 -> 430 + 2

			temp /= 10;
		}

		if (ndgt == n) { out.println("pallindrome"); }
		else { out.println("not pallindrome"); }
	}
}