package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player(""); // Instantiate Player with an empty name
        String expResult = ""; // Define expected result
        String result = instance.getName(); // Invoke method under test
        assertEquals(expResult, result); // Assert that the result matches the expected result
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "John"; // Define name to set
        Player instance = new Player(""); // Instantiate Player with an empty name
        instance.setName(name); // Invoke method under test
        String result = instance.getName(); // Get the updated name
        assertEquals(name, result); // Assert that the name is updated correctly
    }

    @Test
    public void testAddCardToHand() {
        System.out.println("addCardToHand");
        Card card = new Card("Ace", "Hearts", 11); // Create a new Card
        Player instance = new Player("John"); // Instantiate Player with a name
        instance.addCardToHand(card); // Invoke method under test
        List<Card> hand = instance.getHand(); // Get the player's hand
        assertEquals(1, hand.size()); // Assert that the card is added to the hand
        assertEquals(card, hand.get(0)); // Assert that the added card is the same as the created card
    }

    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = new Player("John"); // Instantiate Player with a name
        List<Card> expResult = new ArrayList<>(); // Define expected result
        List<Card> result = instance.getHand(); // Invoke method under test
        assertEquals(expResult, result); // Assert that the result matches the expected result
    }

    @Test
    public void testCalculateHandValue() {
        System.out.println("calculateHandValue");
        Player instance = new Player("John"); // Instantiate Player with a name
        int expResult = 0; // Define expected result
        int result = instance.calculateHandValue(); // Invoke method under test
        assertEquals(expResult, result); // Assert that the result matches the expected result
    }

    @Test
    public void testPlay() {
        System.out.println("play");
        Player instance = new Player("John"); // Instantiate Player with a name
        // No direct assertion possible for play method
    }
}
