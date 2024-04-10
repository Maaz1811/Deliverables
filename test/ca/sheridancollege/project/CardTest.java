package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = new Card("Ace", "Hearts", 11);
        String expResult = "Ace of Hearts";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance = new Card("King", "Diamonds", 10);
        int expResult = 10;
        int result = instance.getValue();
        assertEquals(expResult, result);
    }
}
