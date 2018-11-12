// Name - Omar Elamri


//define Dealer class here
public class Dealer extends AbstractPlayer {
	private Deck deck;

	public Dealer() {
		deck = new Deck();
		resetHand();
	}

	public void shuffle() {
		deck.shuffle();
	}

	public Card deal() {
		return deck.nextCard();
	}

	public boolean hit() {
		return getHandValue() == 0;
	}
}
	
	
	
	//instance variable - Deck 





	//constructors





	//method to shuffle






	//method to deal a card





	//hit method goes here
