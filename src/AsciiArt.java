//Name - Omar Elamri
//Date - 9/7
//Class - AP CS A Bahr
//Lab  - Output

public class AsciiArt {
	static String[][] grid = new String[15][60];

	public static void main(String[] args) {
		System.out.println("Omar Elamri \t 9/8" );
		System.out.println("Picture: A cat? More like a box with a rectangular head.");
		System.out.println("\n\n\n\n" );

		// Ears
		pBox(0, 0, 2, 1, "^");
		pBox(8, 0, 2, 1, "^");

		// Head
		pOutBox(0, 1, 10, 5, 1, "-");

		// Eyes
		pDot(2, 3, "*");
		pDot(7, 3, "*");

		// Mouth
		pBox(2, 4, 6, 1, "=");

		// Torso
		pOutBox(10, 5, 20, 5, 2, "=");

		// Tail
		pBox(30, 7, 10, 1, "=");

		// Legs
		pBox(10, 10, 1, 5, "|");
		pBox(29, 10, 1, 5, "|");


		draw(false);
	}

	public static void pDot(int x, int y, String ch) {
		grid[y][x] = ch;
	}

	public static void pBox(int x, int y, int width, int height, String ch) {
		for (int i = 0; i < grid.length; i++) {
			for (int t = 0; t < grid[i].length; t++) {
				if ((y <= i && i < (y + height)) && (x <= t && t < (x + width))) {
					grid[i][t] = ch;
				}
			}
		}
	}

	public static void pOutBox(int x, int y, int width, int height, int border, String ch) {
		pBox(x, y, width, height, ch);
		pBox(x + border, y + border, width - (border * 2), height - (border * 2), " ");
	}

	public static void draw(boolean debug) {
		if (debug) {
			for (int t = 0; t < grid[0].length; t++) {
				System.out.print(t % 10);
			}
			System.out.print("\n");
		}
		for (int i = 0; i < grid.length; i++) {
			if (debug) {
				System.out.print((i) % 10);
			}
			for (int t = 0; t < grid[i].length; t++) {
				if (grid[i][t] != null) {
					System.out.print(grid[i][t]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}