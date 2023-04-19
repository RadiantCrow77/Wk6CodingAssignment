package com.promineo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
	// list of cards
List <Card> cards = new ArrayList<Card>();


	// suits and #s
String[] suits = {"Clubs","Diamonds", "Hearts","Spades"};
String[] strNumbers = {"Two", "Three", "Four", "Five", "Six", "Seven","Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
int[] numbers  = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};




// Methods
public void shuffle() {
	Collections.shuffle(this.cards); 
}

public Card draw() { 
//	**taking a card out of deck
//	return cards.remove(0);	
	Card currCard = cards.get(0);
	cards.remove(0);
	return currCard;
	
}

// populate the deck
public void populate() {
	// cycle through and give a string num, suit, and num to each card
	for (String suit: suits) {
		for(int i = 0; i < strNumbers.length; i ++) {
//			Card card = new Card(strNumbers[i], suit, numbers[i]);
			Card card = new Card(suit, strNumbers[i], numbers[i]);
			cards.add(card);
//			System.out.println(" Attempting to create"+strNumbers[i]+" "+ suit+" "+numbers[i]);
		}

	}

}

//flip (removes and returns the top card of the Hand)
public Card flip() {
	return this.cards.remove(0);
	
}


public void describeDeck(Deck deck) {
	for(int i = 0; i < 52; i++) {
		Card card1 = deck.cards.get(i);
	System.out.println("Card: "+i+"==="+card1.getValue());
	}
}


}

