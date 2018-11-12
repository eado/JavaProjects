// Omar Elamri

public class BlackJackCard extends Card {
	// constructors
	public BlackJackCard() { setSuit(""); }
	public BlackJackCard(String _suit) { setSuit(_suit); }
	public BlackJackCard(int _face, String _suit) { setFace(_face); setSuit(_suit); }

	public int getValue() {
		// enables you to build the value for the game into the card
		// this makes writing the whole program a little easier
		if (getFace() == 1) {
			return 11;
		}
		if (getFace() > 10) {
			return 10;
		}
		return getFace();
	}

}