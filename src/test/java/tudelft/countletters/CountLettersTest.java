package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("catr|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void firstWordDoesNotMatch() {
        int words = new CountLetters().count("cat|dogr");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void unmatchedWordMiddle() {
        int words = new CountLetters().count("bunnies?cat|dogr");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void nonLetters() {
        int words = new CountLetters().count("12345^&*)()_");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void emptyString() {
        int words = new CountLetters().count("");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void nullString() {
        int words = new CountLetters().count(null);
        Assertions.assertEquals(0, words);
    }
}