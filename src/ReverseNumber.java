
// Name - Omar Elamri
// Date - 9/30/18
// Lab - While Loops

import static java.lang.System.*;

public class ReverseNumber {
	private int number;

	public ReverseNumber(int num) {
		setNum(num);
	}

	public void setNum(int num) {
		number = num;
	}

	public int getReverse() {
		int rev = 0;
		String srev = "";

		int num = number;
		while (num > 0) {
			srev += (num % 10);

			num = (num - (num % 10)) / 10;
		}

		rev = Integer.valueOf(srev);

		return rev;
	}

	public String toString() {
		return number + " reversed is " + getReverse();
	}

}