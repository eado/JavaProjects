
// Name - Omar Elamri
// Date - 11/7

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			out.print("Enter Monster 1's name: ");
			String name1 = keyboard.next();
			out.print("Enter Monster 1's size: ");
			int size1 = keyboard.nextInt();
			Monster monster1 = new Monster(name1, size1);

			out.print("Enter Monster 2's name: ");
			String name2 = keyboard.next();
			out.print("Enter Monster 2's size: ");
			int size2 = keyboard.nextInt();
			Monster monster2 = new Monster(name2, size2);

			out.println(monster1);
			out.println(monster2);

			if (monster1.isBigger(monster2)) {
				out.println(monster1.getName() + " won against " + monster2.getName() + " in a duel.");
			}
			if (monster1.isSmaller(monster2)) {
				out.println(monster1.getName() + " lost against " + monster2.getName() + " in a duel.");
			}
			if (monster2.isBigger(monster1)) {
				out.println(monster2.getName() + " won against " + monster1.getName() + " in a duel.");
			}
			if (monster2.isSmaller(monster1)) {
				out.println(monster2.getName() + " lost against " + monster1.getName() + " in a duel.");
			}
		}

		keyboard.close();
	}
}