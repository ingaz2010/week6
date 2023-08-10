package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	static List<Card> deck = new ArrayList<>();
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String[] cardNames = {"Two", "Three", "Four", "FIve", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	//constructor
	public Deck() {
		for(String suit : suits) {      //fill up deck with cards when we create new Deck object
			int value = 2;
			for(String cardName : cardNames) {
				String name = cardName + " of " + suit; //make full card name 
				Card card = new Card(name, value);     //create a new card object with name and value
				deck.add(card);               //add created card to the deck
				value++;
			}
		}
	}
	
	// shuffle deck
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	// draw card
	public static Card draw() {
		return deck.remove(0);
	}
	
	//display cards in deck
	public void displayDeck() {
		for(Card card : deck) {
			card.describe();
		}
	}

}
