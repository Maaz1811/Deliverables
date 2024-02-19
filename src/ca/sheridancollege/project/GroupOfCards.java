// GroupOfCards.java
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class representing a deck of cards in a Blackjack game.
 * Extends the GroupOfCards class.
 *
 * @author [Your Name]
 * @date [Date]
 */
public class GroupOfCards {

    private ArrayList<Card> cards;
    private int size;

    public GroupOfCards(int size) {
        this.size = size;
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
