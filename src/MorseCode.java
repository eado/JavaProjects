
// Name - Omar Elamri
// Date - 9/25
// Lab - If & Strings

import static java.lang.System.*;

public class MorseCode {
	private char letter;

	private static String[][] grid = {
		{"A", ".-"},
		{"B", "-..."},
		{"C", "-.-."},
		{"D", "-.."},
		{"E", "."},
		{"F", "..-."}
		// More...
	};

	public MorseCode() {
		setChar('A');
	}

	public MorseCode(char let) {
		setChar(let);
	}

	public void setChar(char let) {
		letter = let;
	}

	public String getMorseCode() {
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][0].charAt(0) == letter) {
				return grid[i][1];
			}
		}

		return "A";
	}

	public String toString() {
		return letter + " is " + getMorseCode() + " in morse!\n";
	}
}