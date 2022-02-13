/**
 * check if a number is armstrong or not
 *
 * */

package tkufrwrdlst;

import io.IO;

public class NumberQ5 extends IO {
	public static void main(String[] args) {
		int n = in.nextInt();
		out.println(checkArmstrong(n));
	}

	static boolean checkArmstrong(int n) {
		int temp = n;
		int sum = 0;
		int countn = (int)Math.log10(n) + 1;
		while (temp > 0) {
			int dgt = temp % 10;
			sum = sum + (int)Math.pow(dgt, countn);
			temp /= 10;
		}
		return sum == n;
	}
}