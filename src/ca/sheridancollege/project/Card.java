// Card.java
package ca.sheridancollege.project;

/**
 * A class representing a playing card in a Blackjack game.
 * Extends the Card class.
 *
 * @author [Your Name]
 * @date [Date]
 */
public class Card {

    private String rank; // The rank of the card (e.g., "2", "King", "Ace")
    private String suit; // The suit of the card (e.g., "Hearts", "Clubs", "Diamonds", "Spades")
    private int value; // The value of the card in Blackjack

    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public int getValue() {
        return value;
    }
}
