
// Name - Omar Elamri
// Date - 9/30/18
// Lab - While Loops

import static java.lang.System.*;

public class Perfect {
	private int number;

	public Perfect(int num) {
		number = num;
	}

	public void setNum(int num) {
		number = num;
	}

	public boolean isPerfect() {
		int divisors = 0;
		int i = 1;
		while (i < number) {
			if (number % i == 0) {
				divisors += i;
			}

			i++;
		}

		return divisors == number;
	}

	public String toString() {
		return isPerfect() ? number + " is perfect." : number + " is not perfect.";
	}

}