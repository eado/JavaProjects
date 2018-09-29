
// Name - Omar Elamri
// Date - 9/25
// Lab - If & Strings

import static java.lang.System.*;

import java.util.Scanner;

public class SocialRunner {
	public static void main(String args[]) {
		Scanner key = new Scanner(System.in);

		for (int i = 1; i <= 8; i++) {

			out.println("Trial " + i);
			out.println();

			out.print("Enter your social security number (we promise we won't send it to some Chinese servers :) ) ");
			Social social = new Social(key.nextLine());

			social.chopAndAdd();
			out.println(social.toString());
		}

		key.close();

	}
}