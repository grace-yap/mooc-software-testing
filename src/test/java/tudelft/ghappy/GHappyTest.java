package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
     /*
     Partitions:
     1. null string
     2. empty string
     3. no g
     4. capital G
     5. with g
          a. single g
          b. multiple g's
               - right end
               - left end
               - middle
          c. combinations
               - single g + single g
               - single g + multiple g's
               - multiple g's + multiple g's
      */

     @ParameterizedTest(name = "{0}: {1}, {2}")        //Description: input, expectedResult
     @CsvSource({
             // Null string
             "Null string,,false",
             // Empty string
             "Empty string,'',false",
             // No g
             "No g,asdfasdf,false",
             // Capital G
             "Captial G,asdfGasdf,false", "Captial G,asdfGGasdf,false",
             // Single g
             "Single character g,g,false", "Single g,xxxxg,false", "Single g,gxxxx,false", "Single g,xxgxx,false",
             // Multiple g's
             "Multiple g's left,ggxxxx,true", "Multiple g's middle,xgggxxxx,true", "Multiple g's right,xxgggg,true",
             // Combinations
             "Single g + single g,gxgx,false", "Single g + multiple g,xgxxgg,false", "Multiple g + multiple g,xxggxxxxxxgggxxx,true"
     })
     public void testgHappy(String partition, String input, boolean expectedResult){
          boolean result = new GHappy().gHappy(input);
          Assertions.assertSame(expectedResult, result);
     }
}
