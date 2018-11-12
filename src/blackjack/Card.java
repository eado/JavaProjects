// Name - Omar Elamri

public abstract class Card {
	public static final String FACES[] = { "ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE", "TEN", "JACK", "QUEEN", "KING" };

	private String suit;
	private int face;

	// constructors
	public Card() { suit = ""; }
	public Card(String _suit) { suit = _suit; }
	public Card(int _face, String _suit) { face = _face; }

	// modifiers
	public void setFace(int _face) {
		face = _face;
	}
	public void setSuit(String _suit) {
		suit = _suit;
	}

	// accessors
	public int getFace() {
		return face;
	}
	public String getSuit() {
		return suit;
	}

	public abstract int getValue();

	public boolean equals(Object obj) {
		if (obj instanceof Card) {
			Card c = (Card)obj;
			return c.getFace() == face && c.getSuit() == suit;
		}
		return false;
	}

	public String toString() {
		return FACES[face] + " of " + suit + " | " + getValue();
	}

}