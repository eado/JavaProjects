// Name - Omar Elamri
// Date - 9/25
// Lab - If & Strings

import static java.lang.System.*;

public class StringLengthCheck {
	public static String check(String one, String two) {
		if (one.length() == two.length()) {
			return one + " has the same number of letters as " + two;
		} else {
			return one + " does not have the same number of letters as " + two;
		}
	}
}