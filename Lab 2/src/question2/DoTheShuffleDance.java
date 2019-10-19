package question2;

import java.util.ArrayList;
import java.util.Scanner;

public class DoTheShuffleDance {
	public static final String[] SUITS = { "Clubs", "Diamonds" };
	public static final String[] RANKS = { "2", "3", "4" };

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // Create a brand new deck
		ArrayList<String> deck = makeDeck();
		
		System.out.println("The new deck is " + deck); // Shuffle and print it
		shuffle(deck);
		System.out.println("The shuffled deck is " + deck); // Get information about number of hands to deal, and of what size
															
		System.out.print("How many hands should be dealt? ");
		int numHands = keyboard.nextInt();
		System.out.print("How many cards in each hand? ");
		int numCards = keyboard.nextInt(); // Deal the hands and print them.
		ArrayList<String>[] theHands = deal(deck, numHands, numCards);
		System.out.println("The hands are:");
		for (int i = 0; i < numHands; i++)
			System.out.println("Hand " + i + ": " + theHands[i]);
		System.out.println("The remaining deck: " + deck);
	}// main

	public static ArrayList<String> makeDeck() {
		ArrayList<String> newDeck = new ArrayList<String>();
		// Write your code here
		newDeck.add("2 of Clubs");								//adding cards to deck
		newDeck.add("2 of Diamonds");
		newDeck.add("3 of Clubs");
		newDeck.add("3 of Diamonds");
		newDeck.add("4 of Clubs");
		newDeck.add("4 of Diamonds");
		return newDeck;
	}

	public static void shuffle(ArrayList<String> deck) {
		// Write your code here
		int length = deck.size();
		for(int i = 0; i < length-1 ;i++) {
			int randomNum = (int)((Math.random()*(6-i))+i);	//random number chooser. As 'i' increases
			deck.add(i, deck.get(randomNum));				//Add card to index of i
			deck.remove(++randomNum);						//remove randomNum + 1. (+1 because we added a card)
		}
	}

	public static ArrayList<String>[] deal(ArrayList<String> deck, int numHands, int numCards) {
		ArrayList[] hands = new ArrayList[numHands];
		// Write your code here
		
		for(int a = 0; a < numHands; a++) {			//For every hand...
			hands[a] = new ArrayList<String>();		//Create an ArrayList element in 'hands'
			for(int i = 0; i < numCards; i++) {		// with the number of amount of cards
			hands[a].add(deck.get(0));				//Take card from index 0 to avoid indexOutOfBoundException
			deck.remove(0);							//remove index 0 card from deck
			}

		}
		
		return hands;
	}

}
