package com.Promineotech;

public class App {
    public static void main(String[] args) {
        // Instantiate a Deck and two named players
        Deck deck = new Deck();
        Player player1 = new Player("Sue");
        Player player2 = new Player("Tiffany");

        // Shuffle the deck
        deck.shuffle();

        // Draw 26 cards for each player
        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        // Iterate 26 times and compare the cards flipped
        for (int i = 0; i < 26; i++) {
            Card player1card = player1.flip();
            Card player2card = player2.flip();
              //if player1 has better hand than player2
                if (player1card.getValue() > player2card.getValue()) {
                    player1.incrementScore();
                    System.out.println(player1.getName() + " drew " + player1card.describe() + " and " + player2.getName() + " drew " + 
                    		player2card.describe() + ".");
                    System.out.println(player1.getName() + " wins this round.");
              //if player2 has better hand than player1      
                } else if (player1card.getValue() < player2card.getValue()) {
                    player2.incrementScore();
                    System.out.println(player1.getName() + " drew " + player1card.describe() + " and " + player2.getName() + " drew " + 
                    		player2card.describe() + ".");
                    System.out.println(player2.getName() + " wins this round.");
            //if it is a tie/draw        
                } else {
                    System.out.println("This round is a tie and no points are awarded.");
                }
           //score per round
                System.out.println("Score: " + player1.getName() + " has " + player1.getScore() + " and " + player2.getName() + " has " + player2.getScore() + ".");
            
        }

        // Final score and winner
        System.out.println("Final Score: " + player1.getName() + " has " + player1.getScore() + " and " + player2.getName() + " has " + player2.getScore() + ".");
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins with a score of " + player1.getScore() + "!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins with a score of " + player2.getScore() + "!");
        } else {
            System.out.println("It's a draw between Susan and Sally!");
        }
    }
}
