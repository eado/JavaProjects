// Name - Omar Elamri
// Date - 9/27
// Class - AP CS A Bahr
// Lab - Elevens Lab

public class Card {
	public static final String FACES[][] = { 
			{"ZERO", "0"},
			{"ACE", "1"},
			{"TWO", "2"},
			{"THREE", "3"},
			{"FOUR", "4"},
			{"FIVE", "5"},
			{"SIX", "6"},
			{"SEVEN", "7"},
			{"EIGHT", "8"},
			{"NINE", "9"},
			{"TEN", "10"},
			{"JACK", "11"},
			{"QUEEN", "12"},
			{"KING", "13"}
		};

	// instance variables
	// String suit
	private String suit;
	// int face
	private int face;
	// constructors
	public Card(String s, int f) {
		setSuit(s);
		setFace(f);
	}

	// modifiers
	// set methods
	public void setSuit(String s) {
		suit = s;
	}

	public void setFace(int f) {
		face = f;
	}

	// accessors
	// get methods
	public String getSuit() {
		return suit;
	}

	public int getFace() {
		return face;
	}

	public boolean equals(Card other) {
		return other.getFace() == face && other.getSuit() == suit;
	}

	// toString
	public String toString() {
		String stringFace = "";

		for (int i = 0; i < FACES.length; i++) {
			if (FACES[i][1].equals(Integer.toString(face))) {
				stringFace = FACES[i][0];
			}
		}

		return stringFace + " of " + suit;
	}

}