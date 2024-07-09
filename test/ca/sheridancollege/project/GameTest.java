package ca.sheridancollege.project;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameTest {
    
    @Test
    public void testMainWithValidInput() {
        String input = "John\n"; // Input your test name here
        String expectedOutput = "Enter your name: Hello, John! Welcome to the game.\n";
        testWithInput(input, expectedOutput);
    }

    @Test
    public void testMainWithNoInput() {
        String input = ""; // Empty input
        String expectedOutput = "Enter your name: Error: No input provided.\n";
        testWithInput(input, expectedOutput);
    }

    private void testWithInput(String input, String expectedOutput) {
        // Create a ByteArrayInputStream to simulate input
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        // Redirect System.in to the ByteArrayInputStream
        System.setIn(in);

        // Create a ByteArrayOutputStream to capture output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // Redirect System.out to the ByteArrayOutputStream
        System.setOut(new PrintStream(out));

        // Call the main method of the Game class
        Game.main(new String[]{});

        // Assert that the output matches the expected output
        assertEquals(expectedOutput, out.toString());
    }
}
