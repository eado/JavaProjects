
// Name - Omar Elamri

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack {
	// add in Player instance variable
	private Player player;
	// add in Dealer instance variable
	private Dealer dealer;

	public BlackJack() {
		player = new Player();
		dealer = new Dealer();
	}

	public void playGame() throws InterruptedException {
		out.println("Let's play BlackJack!");

		Scanner keyboard = new Scanner(System.in);

		boolean play = true;

		while (play == true) {
			dealer.shuffle();
			out.println("Shuffling the cards...");
			Thread.sleep(1000);

			out.println("Dealing two cards to player...");
			Thread.sleep(1000);
			player.addCardToHand(dealer.deal());
			player.addCardToHand(dealer.deal());

			out.println("Dealing two cards to dealer...");
			Thread.sleep(1000);
			dealer.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal());

			out.println("Player's standing: ");
			out.println(player);
			out.print("Would you like to hit? Y/n ");
			boolean wantsToHit = true;
			if (keyboard.nextLine().charAt(0) == 'n') {
				wantsToHit = false;
			}
			while (player.getHandValue() < 21 && wantsToHit) {
				out.println("Dealing card...");
				Thread.sleep(1000);
				player.addCardToHand(dealer.deal());
				out.println("Player's standing: ");
				out.println(player);
				out.print("Would you like to hit? Y/n ");
				if (keyboard.nextLine().charAt(0) == 'n') {
					wantsToHit = false;
				}
			}

			out.println("Dealer's standing: ");
			out.println(dealer);
			out.print("Would you like to hit? Y/n ");
			wantsToHit = true;
			if (keyboard.nextLine().charAt(0) == 'n') {
				wantsToHit = false;
			}
			while (player.getHandValue() < 21 && wantsToHit) {
				out.println("Dealing card...");
				Thread.sleep(1000);
				dealer.addCardToHand(dealer.deal());
				out.println("Dealer's standing: ");
				out.println(dealer);
				out.print("Would you like to hit? Y/n ");
				if (keyboard.nextLine().charAt(0) == 'n') {
					wantsToHit = false;
				}
			}

			if (player.getHandValue() == 21 && dealer.getHandValue() == 21) {
				out.println("Tie! Dealer and player win with a value of 21!");
				player.setWinCount(player.getWinCount() + 1);
				dealer.setWinCount(dealer.getWinCount() + 1);
			} else if (dealer.getHandValue() == 21) {
				out.println("Dealer wins with a value of 21!");
				dealer.setWinCount(dealer.getWinCount() + 1);
			} else if (player.getHandValue() == 21) {
				out.println("Player wins with a value of 21!");
				player.setWinCount(player.getWinCount() + 1);
			} else if (player.getHandValue() > 21) {
				out.println("Player loses with a value of " + player.getHandValue());
				dealer.setWinCount(dealer.getWinCount() + 1);
			} else if (dealer.getHandValue() > 21) {
				out.println("Dealer loses with a value of " + dealer.getHandValue());
				player.setWinCount(player.getWinCount() + 1);
			}

			out.print("Would you like to play again? Y/n ");
			if (keyboard.nextLine().charAt(0) == 'n') {
				play = false;
			}

			player.resetHand();
			dealer.resetHand();
		}

		keyboard.close();

	}

	public static void main(String[] args) {
		BlackJack game = new BlackJack();
		try {
			game.playGame();
		} catch (Exception e) {
			
		}
	}
}