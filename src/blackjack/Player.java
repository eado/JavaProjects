// Name - Omar Elamri

import static java.lang.System.*;
import java.util.Scanner;


public class Player extends AbstractPlayer {
	public Player() {
		resetHand();
	}

	public boolean hit() {
		return getHandValue() == 21;
	}
}

