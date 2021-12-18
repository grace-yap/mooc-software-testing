package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {
    /*
    Partitions:
    1. 0 mirror
    2. 1 letter mirror
    3. 2+ letters mirror
    4. mirrors in the middle
    5. mirror but lowercase and uppercase
    6. empty string
    7. null string
     */

    @ParameterizedTest(name = "{0}: {1}, {2}")
    @CsvSource({
            // 0 mirror
            "0 mirror,asdf,''",
            // 1 letter mirror
            "1 letter,aba,aba",
            // 2+ letters even mirror
            "2+ letters even,asdqwerdsa,asd",
            // 2+ letters odd mirror
            "2+ letters odd,asdqwedsa,asd",
            //mirror but uneven
            "uneven mirror,asdQWERsa,as",
            // mirrors in the middle
            "middle mirror,qweasdzxcdsalkj,''",
            // mirror but lowercase and uppercase
            "lower upper,asdqwerDSA,''",
            // empty string
            "empty,'',''",
            // null string
            "null,,"
    })
    public void testMirrorEnds(String partition, String input, String expectedResult) {
        String result = new Mirror().mirrorEnds(input);
        Assertions.assertEquals(expectedResult,result);
    }
}
