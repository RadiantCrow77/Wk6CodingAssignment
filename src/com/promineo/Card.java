package com.promineo;

public class Card {

// Fields
	int value; // 2-14 represents 2-ace
	String strNumbers; // "Ace of Diamonds" etc
	String suits;
	
// Constructor	
	// In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	Card(String suits, String strNumbers, int value) {
		this.suits = suits;
		this.strNumbers = strNumbers;
		this.value = value;
	}

	


	public int getValue() {
		return value;
	}


	public String getSuits() {
		return suits;
	}


	public void setSuits(String suits) {
		this.suits = suits;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public String getName() {
		return strNumbers;
	}


	public void setName(String name) {
		this.strNumbers = name;
	}
	
	

	public void describe() {
		// Describe the whole spread
		System.out.println("Card: "+this.value+" of "+this.strNumbers+" Suit "+this.suits);
		System.out.println("-------------------------------");
	}
}
