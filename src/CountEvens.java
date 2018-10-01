
// Name - Omar Elamri
// Date - 9/30/18
// Lab - While Loops

import static java.lang.System.*;

public class CountEvens {
	public int go(int number) {
		int num = number;

		int count = 0;
		while (num > 0) {
			if ((num % 10) % 2 == 0) {
				count++;
			}

			num = (num - (num % 10)) / 10;
		}

		return count;
	}
}