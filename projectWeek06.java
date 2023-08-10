package week06;

public class projectWeek06 {

	public static void main(String[] args) {
		Deck deck = new Deck(); //create a new deck

		deck.shuffle();     //shuffle
		deck.displayDeck(); // display to make sure shuffle method worked
		//instantiate 2 players
		Player player1 = new Player("Paul");
		Player player2 = new Player("Sarah");
		
		// spreading cards between 2 players
		for(int i = 0; i < 52; i++) {
			if(i%2==0) {
				player1.draw();
			} else {
				player2.draw();	}		
		}
		player1.describe(); //display player's info and cards
		player2.describe();
		
		// flipping cards and compare them
		for(int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			System.out.print( "Player 1 card: ");
			card1.describe();  //display flipped cards
			System.out.print( "Player 2 card: ");
			card2.describe();
			if(card1.getValue() > card2.getValue()) { //compare the value of the cards
				player1.incrementScore();            //whoever has bigger value get +1 point to the score
				System.out.println("1 point goes to player 1");
			} else if(card2.getValue() > card1.getValue()) {
				player2.incrementScore();
				System.out.println("1 point goes to player 2");}
			System.out.println("Player 1 score: " + player1.getScore()); //print out the score on every loop
			System.out.println("Player 2 score: " + player2.getScore());
			System.out.println("--------------------------------------");
		}
		
		//check and display who won
		System.out.println("RESULTS:");
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 " + player1.getName() + " is the winner. Congratulations " + player1.getName() + "!");
		}else if(player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 " + player2.getName() + " is the winner. Congratulations " + player2.getName() + "!");
		} else {
			System.out.println("It's a draw");
		}
		
	

	}

}
