
// Name - Omar Elamri
// Date - 9/30/18
// Lab - While Loops

import static java.lang.System.*;

public class Divisors {
	public static String getDivisors(int number) {
		String divisors = number + " has divisors ";

		int i = 1;
		while (i < number) {
			if (number % i == 0) {
				divisors += i + " ";
			}

			i++;
		}

		return divisors;
	}
}