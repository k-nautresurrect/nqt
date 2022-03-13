/**
 * print the greatest of the three number
 *
 * */

package tkufrwrdlst;

import io.IO;

public class NumberQ13 extends IO {
	public static void main(String[] args) {
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();

		if (n1 > n2 && n1 > n3) {
			out.println(n1);
		} else if (n2 > n3 && n2 > n1) {
			out.println(n2);
		} else if (n3 > n1 && n3 > n1) {
			out.println(n3);
		}

		maxOfThree(n1, n2, n3);
		mathMaxOfThree(n1, n2, n3);
	}

	static void maxOfThree(int n1, int n2, int n3) {
		out.println(
		    (n1 > n2) ?
		    (n1 > n3 ? n1 : n3) :
		    (n2 > n3 ? n2 : n3)
		);
	}

	static void mathMaxOfThree(int n1, int n2, int n3) {
		out.println(
		    Math.max(n1, Math.max(n2, n3))
		);
	}
}
