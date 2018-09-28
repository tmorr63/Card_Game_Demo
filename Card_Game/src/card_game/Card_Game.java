package card_game;

import java.util.Random;

public class Card_Game {
//This project is the base code for a card game.
//All this code will do is randomly draw cards from a deck of 52.

    public static void main(String[] args) {

        Random randGen = new Random(); 
        int y = randGen.nextInt(5); //y is uniform in (0,1,2,3,4).

        int[] deck = new int[52]; //makes array for the 52 cards.
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        //shuffle the deck
        int temp, swapindex;
        for (int i = 0; i < deck.length; i++) {
            swapindex = randGen.nextInt(deck.length); //swapIndex randomizes the deck.
            temp = deck[i];
            deck[i] = deck[swapindex]; //applies the shuffle
            deck[swapindex] = temp; 
        }
        
        int p1 = deck[0]; //player one's first card
        int c1 = deck[1]; //computer's first card
        int p2 = deck[2]; //player one's second card
        int c2 = deck[3]; //computer's second card
        
        System.out.println("Player 1's first card is " +p1+ " with real name "+ cardName(p1));
        System.out.println("Computer's first card is " +c1+ " with real name " + cardName(c1));
        System.out.println("Player 1's second card is " +p2+ " with real name " + cardName(p2));
        System.out.println("Computer's second card is " +c2+ " with real name " + cardName(c2));
    }
    
    public static String cardName(int val) {
        //This is a method to apply suit/card numbers to the numbers in the array.
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; //creates an array that applies suits.
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //creates an array that applies real value.
        String name = "";
        int theRank = val % 13; //to find the rank of the card, we use the formula (randomInt % 13).
        int theSuit = val / 13; //to find the suit of the card, we divide the randomInt by 13.

        name = ranks[theRank] + " of " + suits[theSuit];
        
        return name;
    }

}
