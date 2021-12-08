package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    /*
    Partitions:
    1. Invalid string (NOT lowercase letters or space)
    2. Valid string
        - lowercase only
        - space only
        - lowercase + space
            - space left
            - space middle
            - space right
    3. Invalid shift
    4. Valid Shift
        a. negative
        b. 0
        c. positive
        d. null
     */

    @ParameterizedTest(name = "{0}: {1}, {2}, {3}")
    @CsvSource({
            // Invalid input
            "Capital letters,ABCDE,3,invalid", "Symbols,!@#$%,3,invalid", "Null input,,3,invalid",
            // Valid lowercase only
            "Lowercase only,abcde,3,defgh",
            // Valid space only
            "1 space,' ',3,' '", "Multiple spaces,'     ',3,'     '",
            // Valid lowercase + space left
            "Lowercase + space left, asdf,3, dvgi",
            // Valid lowercase + space middle
            "Lowercase + space middle,as df,3,dv gi",
            // Valid lowercase + space right
            "Lowercase + space right,asdf ,3,dvgi ",
            // Negative shift
            "Negative shift,asdf,-3,xpac",
            // 0 shift
            "0 shift,asdf,0,asdf",
            // Positive shift
            "Positive shift,asdf,100,wozb",
            // Null shift
            "Null shift,asdf,null,invalid",
    })
    public void testCaesarShift(String partition, String input, int num, String expectedOutput){
         String output = new CaesarShiftCipher().CaesarShiftCipher(input, num);
        Assertions.assertEquals(expectedOutput, output);
    }

}
