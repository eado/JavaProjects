
// Name - Omar Elamri
// Date - 9/25
// Lab - If & Strings

import static java.lang.System.*;

public class Social {
	private String socialNum;
	private int sum;

	public Social() {
		setWord("");
	}

	public Social(String soc) {
		setWord(soc);
	}

	public void setWord(String w) {
		socialNum = w;

		sum = 0;
	}

	public void chopAndAdd() {
		for (int i = 0; i < socialNum.length(); i++) {
			if (Character.isDigit(socialNum.charAt(i))) {
				sum += Integer.parseInt(socialNum.substring(i, i + 1));
			}
		}
	}

	public String toString() {
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}