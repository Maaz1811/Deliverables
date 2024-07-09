package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class GroupOfCardsTest {

    @Test
    public void testGetCards() {
        System.out.println("getCards");
        GroupOfCards instance = new GroupOfCards(52); // Instantiate GroupOfCards with size 52
        ArrayList<Card> result = instance.getCards(); // Invoke method under test
        assertNotNull(result); // Assert that the result is not null
        assertEquals(52, result.size()); // Assert that the result has a size of 52
    }

    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards(52); // Instantiate GroupOfCards with size 52
        instance.shuffle(); // Invoke method under test
        // No direct assertion possible for shuffle method
    }

    @Test
    public void testGetSize() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(52); // Instantiate GroupOfCards with size 52
        int result = instance.getSize(); // Invoke method under test
        assertEquals(52, result); // Assert that the result is equal to the initial size
    }

    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 20; // Define size to set
        GroupOfCards instance = new GroupOfCards(52); // Instantiate GroupOfCards with size 52
        instance.setSize(size); // Invoke method under test
        int result = instance.getSize(); // Get the updated size
        assertEquals(size, result); // Assert that the size is updated correctly
    }
}
