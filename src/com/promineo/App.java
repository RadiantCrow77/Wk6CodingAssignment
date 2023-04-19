package com.promineo;


// Game of War: two player game where deck is shuffled and cut in half, ranked from 2 --> Ace, with suit not mattering in point value
// At start, one card is flipped from each side at the same time
// Player with highest value gets a point
// if same value, war happens

public class App {

	public static void main(String[] args) {
	// instantiate classes
	Deck deck = new Deck();
	Player player1 = new Player("1",  0); // name, score
	Player player2 = new Player("2", 0);
	
	deck.populate(); // populate deck
	
	deck.shuffle(); // shuffle deck on start

//deck.describeDeck(deck);
//	 for loop - iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
	for(int i = 0; i <52; i++) {
		if(i%2==0) { // if even, player 1 draws
		player1.draw(deck.draw()); // passes a card from deck -> hand
		
		}else { // if odd, player 2 draws
		player2.draw(deck.draw());
		}
	}
	
//	Using a traditional for loop, iterate 26 times and call the flip method for each player.
	for(int i = 0; i <26; i++) {
		Card cardA = player1.flip();
		Card cardB = player2.flip();
		
		// Compare the value of each card returned by the two player’s flip methods. 
		//Call the incrementScore method on the player whose card has the higher value
		if(cardA.getValue()>cardB.getValue()) {
			//increment p1 score
			player1.incrementScore();
			
			System.out.println(player1.getName()+" won this round!");
		
		}else if(cardB.getValue()>cardA.getValue()) {
			// increment p2 score
			player2.incrementScore();
			System.out.println(player1.getName()+" won this round!");
		}else {
	System.out.println("Sorry, it's a tie!");
		}
	}
	
	System.out.println("P1 Final score: "+player1.getScore());
	System.out.println("P2 Final score: "+player2.getScore());
	if(player1.getScore()>player2.getScore()) {
	System.out.println("Final Winner: "+player1.getName());
	}else if (player2.getScore()>player1.getScore()){
		System.out.println("Final Winner: Player # "+player2.getName());
	}else {
		System.out.println("Final Winner: Draw!");
	}
	
	}

}
