package com.promineo;

import java.util.ArrayList;
import java.util.List;


public class Player {
// Fields
	// hand (List of Card)
	List <Card> hand;
	private int score;
	private String name;
	
	
// Player Constructor
	Player(String name,  int score) {
		this.name = name;
		// score (set to 0 in constructor)
		this.score = 0;
		this.hand=new ArrayList<Card>();
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

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	
	public void describe(){
		System.out.println("Player's Name: "+this.name+" has hand: ");
		for (Card card: hand) {
			card.describe();
		}
		
		System.out.println("\n");

		System.out.println("Player's Name: "+this.name+" Score: "+this.score);
	}
	
	public Card flip() {
		return hand.remove(0); // remove the top card of hand and return it
	}
	
	public void draw(Card card) {
		card.describe();
	this.hand.add(card);

	}
	
	public void incrementScore() {
		this.score = this.score+1;
	}
}
