
// Name - Omar Elamri
// Date - 9/25
// Lab - If & Strings

import static java.lang.System.*;

import java.util.Scanner;

public class MorseCodeRunner {
	public static void main(String args[]) {
		out.println("Please note that I have not filled in all the morse values. A-F return the actual morse value, and the rest return \"A\"");
		Scanner key = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			out.print("Input a char: ");

			MorseCode mc = new MorseCode(key.next().charAt(0));

			out.println(mc);
		}

		key.close();

	}
}