// Game.java
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class representing the Blackjack game.
 * This class contains the main logic for the game.
 *
 * @author [Your Name]
 * @date [Date]
 */
public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a deck of cards and shuffle it
        GroupOfCards deck = new GroupOfCards(52);
        initializeDeck(deck);
        deck.shuffle();

        // Create players
        Player dealer = new Player("Dealer");
        Player player = new Player("Player");

        // Deal initial cards
        dealInitialCards(deck, dealer);
        dealInitialCards(deck, player);

        // Show initial hands
        System.out.println("Dealer's hand: " + dealer.getHand().get(0) + " [Hidden Card]");
        System.out.println("Player's hand: " + player.getHand().get(0) + ", " + player.getHand().get(1));

        // Player's turn
        while (true) {
            System.out.println("Do you want to (h)it or (s)tand?");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("h")) {
                Card card = drawCard(deck);
                player.addCardToHand(card);
                System.out.println("You drew: " + card);

                int playerHandValue = player.calculateHandValue();
                System.out.println("Your hand value: " + playerHandValue);

                if (playerHandValue > 21) {
                    System.out.println("Busted! You lose.");
                    break;
                }
            } else if (choice.equals("s")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'h' to hit or 's' to stand.");
            }
        }

        // Dealer's turn
        while (dealer.calculateHandValue() < 17) {
            Card card = drawCard(deck);
            dealer.addCardToHand(card);
        }

        // Determine winner
        int playerHandValue = player.calculateHandValue();
        int dealerHandValue = dealer.calculateHandValue();

        System.out.println("Dealer's hand: " + dealer.getHand() + " (Value: " + dealerHandValue + ")");
        System.out.println("Player's hand: " + player.getHand() + " (Value: " + playerHandValue + ")");

        if (playerHandValue > 21 || (dealerHandValue <= 21 && dealerHandValue > playerHandValue)) {
            System.out.println("Dealer wins!");
        } else if (dealerHandValue > 21 || (playerHandValue <= 21 && playerHandValue > dealerHandValue)) {
            System.out.println("Player wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    private static void initializeDeck(GroupOfCards deck) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String suit : suits) {
            for (String rank : ranks) {
                int value = getValue(rank);
                deck.getCards().add(new Card(rank, suit, value));
            }
        }
    }

    private static int getValue(String rank) {
        if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
            return 10;
        } else if (rank.equals("Ace")) {
            return 11; // For simplicity, we'll set the initial value of Ace to 11
        } else {
            return Integer.parseInt(rank);
        }
    }

    private static void dealInitialCards(GroupOfCards deck, Player player) {
        player.addCardToHand(drawCard(deck));
        player.addCardToHand(drawCard(deck));
    }

    private static Card drawCard(GroupOfCards deck) {
        return deck.getCards().remove(0);
    }
}
