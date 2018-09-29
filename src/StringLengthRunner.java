// Name - Omar Elamri
// Date - 9/25
// Lab - If & Strings

import static java.lang.System.*;

import java.util.Scanner;

public class StringLengthRunner {
	public static void main(String args[]) {
		Scanner key = new Scanner(System.in);

		for (int i = 1; i <= 8; i++) {
			out.println("Trial " + i);
			out.println();

			out.print("Enter a word: ");
			String one = key.next();
			out.print("Enter another word: ");
			String two = key.next();

			out.println(StringLengthCheck.check(one, two));
		}

		key.close();
	}
}