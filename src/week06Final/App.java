package week06Final;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
	
		
		Deck warDeck = new Deck();
		
		List<Card> p1Hand = new ArrayList<Card>();
		List<Card> p2Hand = new ArrayList<Card>();
		
		
		Player p1 = new Player("Sarah", p1Hand, 0);
		p1.setHand(p1Hand);
		p1.setScore(0);
		Player p2 = new Player("Derrick", p2Hand, 0);
		p2.setHand(p2Hand);
		p2.setScore(0);
		
		System.out.println("-------Showing the 52 cards----\n");
		warDeck.describe();
		
		warDeck.shuffle();
		System.out.println("\n\n ----Showing the shffled Deck----\n");
		warDeck.describe();
		
		for(int i = 0; i < 52; i ++) {
			if(i % 2 == 0) {
				p1.draw(warDeck);
			}else {
				p2.draw(warDeck);
			}
		}
		
		p1.describe();
		p2.describe();
		
		for (int i = 0; i < 26; i++) {
			Card p1Card = p1.flip();
			Card p2Card = p2.flip();
			if (p1Card.getValue() > p2Card.getValue()) {
				p1.incrementScore();
			}else if(p2Card.getValue() > p1Card.getValue()) {
				p2.incrementScore();
			}
		}
		System.out.println("\nSarah's score is: " + p1.getScore());
		System.out.println("\nDerrick's score is: " + p2.getScore());
		
		if(p1.getScore() > p2.getScore()) {
			System.out.println("\nSarah is the WINNER!!!");
		}else if(p1.getScore() < p2.getScore()) {
			System.out.println("\nDerrick is the Winner!!!");
		}else {
			System.out.println("\nThe game is a DRAW!!!");
		}

	}

}
