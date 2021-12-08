package tudelft.srWordCount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class srWordCountTest {
    @ParameterizedTest(name = "{0}: {1}")
    @CsvSource({
            "2 words,cats|dogs?rats,2"
    })
    public void testCount(String partition, String input, int expectedResult){
        int result = new srWordCount().count(input);
        //Assertions.assertEquals(expectedResult, result);
        System.out.println(result);
    }
}
