package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {
    /*
    Partitions:
    1. link 1 length = link 2 length
    2. link 1 length > link 2 length
    3. link 1 length < link 2 length
    4. 0 at the end
    5. both 0
    6. with carry
    7. without carry
     */
    /*
    @ParameterizedTest(name = "{0}: {1}, {2}, {3}")
    @CsvSource({
            // link 1 length = link 2 length
            "link1 = link2, [1,2,3], [4,5,6], [5,7,9]",
            // link 1 length > link 2 length
            "link1 > link2, [1,2,3,4], [5,6], [6,8,3,4]",
            // link 1 length < link 2 length
            "link1 < link2, [1,2], [3,4,5,6], [4,6,5,6]",
            // 0 at the end
            "link1 0 end, [2,1,0], [5,4,3], [7,5,3]", "link2 0 end, [1,2,3], [4,5,0], [5,7,3]", "both 0 end, [1,0,0], [2,0,0], [3,0,0]",
            // both 0
            "both 0, [0], [0], [0]",
            // with carry
            "with carry, [7,7,7,7,7], [8,8,8,8,8], [5,6,6,6,6,1]",
            // without carry
            "without carry, [1,1,1,1,1,1],[2,2], [3,3,1,1,1]"
    })
    public void testAddTwoNumbers(String partition, ArrayList<Integer> linkOne, ArrayList<Integer> linkTwo, ArrayList<Integer> expectedResult){

        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(Arrays.asList(linkOne.split(",")), linkTwo);
        Assertions.assertEquals(expectedResult, result);
    }
     */

    @Test
    public void testAddTwoNumbers(){
        Integer[] linkOne = {1,2,3};
        Integer[] linkTwo = {4,5,6};
        Integer[] expectedResult = {5,7,9};
        //ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(linkOne,linkTwo);
        //Assertions.assertSame(expectedResult,result);
    }
}