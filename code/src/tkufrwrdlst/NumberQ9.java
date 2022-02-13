/**
 * sum of first n natural numbers
 * */

package tkufrwrdlst;

import io.IO;

public class NumberQ9 extends IO {
	public static void main(String[] args) {
		int n =  in.nextInt();
		out.println(SumOfN(n));
		out.println(SumOfN(n, 'b'));
	}

	static long SumOfN(int n) {
		long sum = 0;
		while (n > 0) {
			sum += n;
			n--;
		}
		return sum;
	}

	static long SumOfN(int n , char ch) {
		return (n * (n + 1)) / 2;
	}
}