package com.Promineotech;

public class Card {
		public int value;
		private String suit;
		 
		 Card(String suit, int value){
			 this.value = value;
			 this.suit = suit;
			 
		 }
		 
		public String getSuit() {
			return suit;
		}
		public void setSuit(String suit) {
			this.suit = suit;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}

		public String describe() {
			return this.suit + " worth " + this.value;
			
		}

	}