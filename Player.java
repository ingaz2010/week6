package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;   // player's name
	private int score;    //score 
	List<Card> hand = new ArrayList<>();  // list of player's cards
	
	//constructor
	public Player(String name) {
		this.name = name;
		this.score = 0;
		
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	// display player's information
	public void describe() {
		System.out.println("----------------------------------------");
		System.out.println("Player's name: " + name + " Score: " + score);
		System.out.println("Player's cards: ");
		for(Card card : hand) {
			card.describe();
		}
		System.out.println("----------------------------------------");
	}
	
	//draw a card from deck and add to player's hand
	public Card draw() {
		Card card = Deck.draw();
		hand.add(card);
		return card;
	}
	
	//flip the first card
	public Card flip() {
		return hand.remove(0);
	}
	
	//add 1 point to score for the winning player
	public int incrementScore() {
		return score++;
	}

}
