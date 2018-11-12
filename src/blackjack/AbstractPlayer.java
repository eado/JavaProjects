
// Name - Omar Elamri

import java.util.ArrayList;

public abstract class AbstractPlayer implements Playerable {
    private ArrayList<Card> hand;
    private int winCount;

    // constructors

    public void addCardToHand(Card temp) {
        hand.add(temp);
    }

    public void resetHand() {
        hand = new ArrayList<Card>();
    }

    public void setWinCount(int numwins) {
        winCount = numwins;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getHandSize() {
        return hand.size();
    }

    public int getHandValue() {
        // great example of polymorphism
        int total = 0;

        for (int i = 0; i < hand.size(); i++) {
            total += hand.get(i).getValue();
        }

        return total;
    }

    public String toString() {
        return "hand = " + hand.toString() + " value - " + getHandValue() + " \n-  # wins " + winCount;
    }
}