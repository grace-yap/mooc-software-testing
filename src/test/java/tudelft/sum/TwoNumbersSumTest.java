package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

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


    @ParameterizedTest(name = "{0}: {1}, {2}, {3}")
    @CsvSource({
            // link 1 length = link 2 length
            "link1 = link2,'[1,2,3]','[4,5,6]','[5,7,9]'",
            // link 1 length > link 2 length
            "link1 > link2,'[1,2,3,4]','[5,6]','[6,8,3,4]'",
            // link 1 length < link 2 length
            "link1 < link2,'[1,2]','[3,4,5,6]','[4,6,5,6]'",
            // 0 at the end
            "link1 0 end,'[2,1,0]','[5,4,3]','[7,5,3]'", "link2 0 end,'[1,2,3]','[4,5,0]','[5,7,3]'", "both 0 end,'[1,0,0]','[2,0,0]','[3,0,0]'",
            // both 0
            "both 0,'[0]','[0]','[0]'",
            // with carry
            "with carry,'[7,7,7,7,7]','[8,8,8,8,8]','[5,6,6,6,6,1]'",
            // without carry
            "without carry,'[1,1,1,1,1,1]','[2,2]','[3,3,1,1,1]'"
    })



    public void testAddTwoNumbers(String partition, String[] linkOne, String[] linkTwo, String[] expectedResult){
        System.out.println("linkOne: "+linkOne);
        ArrayList<Integer> intListOne = new ArrayList<>();
        ArrayList<Integer> intListTwo = new ArrayList<>();
        ArrayList<Integer> intExpectedResult = new ArrayList<>();
        for (String s1 : linkOne) {
            intListOne.add(Integer.parseInt(s1));
        }
        System.out.println("intListONe: "+intListOne);
        for (String s2 : linkTwo) {
            intListTwo.add(Integer.parseInt(s2));
        }
        for (String s3 : expectedResult) {
            intExpectedResult.add(Integer.parseInt(s3));
        }

        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(intListOne,intListTwo);
        Assertions.assertEquals(intExpectedResult,result);
    }


    /*
    @ParameterizedTest
    @MethodSource("arrayProvider")
    public void testAddTwoNumbers(ArrayList<> args){
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(args.getFirst,linkTwo);

    }

    static Stream<Arguments> arrayProvider(){
        return Stream.of(
                Arguments.of((Object) new ArrayList<>(Arrays.asList(1,2,3))),
                Arguments.of((Object) new ArrayList<>(Arrays.asList(4,5,6))),
                Arguments.of((Object) new ArrayList<>(Arrays.asList(5,7,9)))
        );
    }
    */

    /*
    @Test
    public void testAddTwoNumbers(){
        ArrayList<Integer> linkOne = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> linkTwo = new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(5,7,9));

        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(linkOne,linkTwo);
        Assertions.assertEquals(expectedResult,result);
    }
     */
}