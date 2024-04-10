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
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Game.main(new String[]{});

        assertEquals(expectedOutput, out.toString());
    }
}
