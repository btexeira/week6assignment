package com.Promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

		final String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		final int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		private List<Card> cards = new ArrayList<Card>();
		
	public Deck () {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < value.length; j++) {
				if (value[j] == 11) {
					cards.add(new Card("a Jack" + " of " + suits[i], value[j])); //jack value
				} else if (value[j] == 12) {
					cards.add(new Card("a Queen" + " of " + suits[i], value[j])); //queen value
				} else if (value[j] == 13) {
					cards.add(new Card("a King" + " of " + suits[i], value[j])); //king value
				} else if (value[j] == 14) {
					cards.add(new Card("an Ace" + " of " + suits[i], value[j])); //ace value
				} else {
					cards.add(new Card(suits[i], value[j]));
				}
			}
		}
	}

	public void shuffle() { //shuffle the deck
		Collections.shuffle(this.cards); 
	}

	public Card draw() { //remove drawn cards from deck
		Card card = this.cards.remove(0);
		return card;
	}
}