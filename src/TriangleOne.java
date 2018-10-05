
// Name - Omar Elamri
// Date - 10/4/18
// Class - AP CS A Bahr
// Lab - Nested Loops

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne {
	// this lab is setup with a single static method
	// there are no instance variables or additional methods / constructors

	public static String createTriangle(String let, int size) {
		String output = "";

		for (int i = 1; i <= size; i++) {
			for (int t = 1; t <= i; t++) {
				System.out.print(let);
			}
			out.println();
		}

		return output;
	}
}