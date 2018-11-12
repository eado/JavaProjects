
// Name - Omar Elamri

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = { "CLUBS", "SPADES", "DIAMONDS", "HEARTS" };

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck() {
		// initialize data - stackOfCards - topCardIndex
		stackOfCards = new ArrayList<Card>();
		topCardIndex = NUMCARDS - 1;

		// loop through suits
		for (int i = 0; i < NUMSUITS; i++) {
			for (int t = 0; t < NUMFACES; t++) {
				stackOfCards.add(new BlackJackCard(t, SUITS[i]));
			} 
		}
		// loop through faces
		// add in a new card

	}

	// modifiers
	public void shuffle() {
		Collections.shuffle(stackOfCards);

		topCardIndex = NUMCARDS - 1;
		// reset variables as needed
	}

	// accessors
	public int size() {
		return stackOfCards.size();
	}

	public int numCardsLeft() {
		return topCardIndex + 1;
	}

	public Card nextCard() {
		return stackOfCards.get(topCardIndex--);
	}

	public String toString() {
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	}
}