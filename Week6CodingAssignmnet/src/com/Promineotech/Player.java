package com.Promineotech;

public class Player {
    Card[] hand;  // Array to hold the player's hand
    int score;    // player's score
    String name;  // player's name
    int handHeld; //player's cards in hand

    Player(String name) { //player entity
        this.name = name;
        this.hand = new Card[26];
        this.score = 0;
        this.handHeld = 0;
    }

    String getName() { //player name
        return name;
    }

    // Method to flip
    Card flip() {
        if (handHeld > 0) {
            return hand[--handHeld];
        } else {
            return null;  // No cards left in the hand
        }
    }

    // Method to draw a card and add it to the hand
    void draw(Deck deck) {
        if (handHeld < hand.length) {
            hand[handHeld++] = deck.draw();
        }
    }

    // Method to increment the score by 1
    void incrementScore() {
        score++;
    }

    // Getter for score
    int getScore() {
        return score;
    }
}
