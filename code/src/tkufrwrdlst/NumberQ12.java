/**
 * find greatest of two number (mixed types)
 *  genric.
 * */

package tkufrwrdlst;

import io.IO;

public class NumberQ12 extends IO {
	public static void main(String[] args) {
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();

		out.println((int)Math.max(num1, num2));

	}

}