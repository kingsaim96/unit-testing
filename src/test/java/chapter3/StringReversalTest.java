package chapter3;

import chapter3.StringReversal;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnitParamsRunner.class)
public class StringReversalTest {

    private Object[] getSuccessfulStrings(){
        return new Object[][] {{"Hello", "olleH"}, {"bye", "eyb"}, {"pawn", "nwap"}, {"aba", "aba"}};
    }

    private Object[] getUnsuccessfulStrings(){
        return new Object[][] {{"Hello", "olleh"},
                new Object[] {"bye", "eyc"}, new Object[] {"pawn", "nawp"},
                new Object[] {"aba", "aBA"}};
    }

    @Parameters(method="getSuccessfulStrings")
    @Test
    public void reverseString_Successful(String input, String expectedOutput){

        String actualOutput = StringReversal.reverse(input);
        assertEquals("String reversal is unsuccessful", expectedOutput, actualOutput);
    }

    @Parameters(method="getUnsuccessfulStrings")
    @Test
    public void reverseString_Unsuccessful(String input, String expectedOutput){

        String actualOutput = StringReversal.reverse(input);
        assertNotEquals("String reversal is unsuccessful", expectedOutput, actualOutput);
    }

    @Test
    public void reverseString_CaseSensitive(){
        String input="Crab";
        String expectedOutput="barc";

        String actualOutput = StringReversal.reverse(input);
        assertNotEquals(expectedOutput, actualOutput);
    }

    @Test
    public void reverseEmptyString(){
        String actualOutput = StringReversal.reverse("");
        assertEquals("", actualOutput);
    }

    @Test(expected = NullPointerException.class)
    public void reverseNullString(){
        String actualOutput = StringReversal.reverse(null);
    }

}
