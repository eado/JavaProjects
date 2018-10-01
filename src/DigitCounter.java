
// Name - Omar Elamri
// Date - 9/30/18
// Lab - While Loops

import static java.lang.System.*;

public class DigitCounter {
	public int go(int number) {
		int num = number;

		int count = 0;
		while (num > 0) {
			num = (num - (num % 10)) / 10;

			count++;
		}

		return count;
	}
}