package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a player in a Blackjack game.
 * This class does not extend any other class.
 * It contains methods to manage the player's hand and calculate hand value.
 * 
 * @author [Your Name]
 * @date [Date]
 */
public class Player {

    private String name; // The unique name for this player
    private List<Card> hand; // The player's hand

    /**
     * A constructor that allows you to set the player's unique name.
     *
     * @param name the unique name to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     * Gets the name of the player.
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds a card to the player's hand.
     *
     * @param card the card to add to the hand
     */
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    /**
     * Gets the player's hand.
     *
     * @return a list of cards representing the player's hand
     */
    public List<Card> getHand() {
        return hand;
    }

    /**
     * Calculates the value of the player's hand.
     * Aces are counted as 11 unless it causes the total to exceed 21,
     * in which case they are counted as 1.
     *
     * @return the value of the player's hand
     */
    public int calculateHandValue() {
        int sum = 0;
        int numberOfAces = 0;
        for (Card card : hand) {
            sum += card.getValue();
            if (card.getValue() == 11) {
                numberOfAces++;
            }
        }
        // Adjust the value of Aces if the total sum exceeds 21
        while (sum > 21 && numberOfAces > 0) {
            sum -= 10; // Convert Ace from 11 to 1
            numberOfAces--;
        }
        return sum;
    }

    /**
     * A method to play the game.
     * Each player's specific logic for playing the game should be implemented here.
     */
    public void play() {
        // Implement player logic for playing the game
    }
}
