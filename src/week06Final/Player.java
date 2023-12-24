package week06Final;

import java.util.List;

public class Player {
	
	public String name;
	public List<Card> hand;
	public int score;
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score= 0;
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void describe() {
		System.out.println("\n\nPlayer " + name + " has a score of " + score + " and the following cards: \n");
		for (Card card : hand) {
			card.describe();
		}
	}
	

}
