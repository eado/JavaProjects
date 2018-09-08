//Name - Omar Elamri
//Date - 9/7
//Class - AP CS A Bahr
//Lab  - Output

public class AsciiArt {
	public static void main(String[] args) {
		System.out.println("Omar Elamri \n\n" );
		System.out.println("Picture: A cat? More like a box with a rectangular head.");
		System.out.println("\n\n\n\n" );

		pBox();
	}

	public static void pBox() {
		pChar("A", 30, true);
		pChar("+", 30, true);

		int i = 0;
		while (i < 8) {
			i++;
			pChar("+", 3, false);
			pChar(" ", 24, false);
			pChar("+", 3, true);
		}

		pChar("+", 30, true);
		pChar("A", 30, true);
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