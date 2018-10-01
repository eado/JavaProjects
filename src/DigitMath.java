
// Name - Omar Elamri
// Date - 9/30/18
// Lab - While Loops

import static java.lang.System.*;

public class DigitMath {
	public int countDigits(int number) {
		int num = number;

		int count = 0;
		while (num > 0) {
			num = (num - (num % 10)) / 10;

			count++;
		}

		return count;
	}

	public int sumDigits(int number) {
		int num = number;

		int count = 0;
		while (num > 0) {
			count += (num % 10);

			num = (num - (num % 10)) / 10;
		}

		return count;
	}

	// method go must call countDigits and sumDigits
	// to receive full credit
	public double go(int number) {
		return (double)sumDigits(number) / (double)countDigits(number);
	}
}