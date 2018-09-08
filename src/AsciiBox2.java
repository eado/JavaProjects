//Name - Omar Elamri
//Date - 9/7
//Class - AP CS A Bahr
//Lab  - Output

public class AsciiBox2 {
	public static void main(String[] args) {
		System.out.println("Omar Elamri \t 9/7 \n");
		pChar("A", 30, true);
		pChar("+", 30, true);

		int i = 0;
		while (i < 4) {
			i++;
			pChar("+", 3, false);
			pChar(" ", 24, false);
			pChar("+", 3, true);
		}

		pChar("+", 3, false);
		pChar(" ", 8, false);
		System.out.print("CompSci");
		pChar(" ", 9, false);
		pChar("+", 3, true);

		i = 0;
		while (i < 4) {
			i++;
			pChar("+", 3, false);
			pChar(" ", 24, false);
			pChar("+", 3, true);
		}

		pChar("A", 30, true);
		pChar("+", 30, true);
	}

	private static void pChar(String ch, int length, boolean end) {
		int i = 0;
		while (i < length) {
			i++;
			System.out.print(ch);
		}

		if (end) {
			System.out.println();
		}
	}
}