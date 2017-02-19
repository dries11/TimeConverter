package ries.dan;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danries on 2/15/17.
 */
public class ParserTest {

    Parser parser = new Parser();

    String standardInputCorrect = "1:47pm";
    String standardInputIncorrect = "esdfrg32423";
    String militaryInputCorrect = "13:47";
    String militaryInputIncorrect = "1234523";

    @Test
    public void parseItTestStandardCorrectTimeEntered(){
        String expected = "One Forty-Seven pm";
        String actual = parser.parseIt(standardInputCorrect);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void parseItTestStandardIncorrectTimeEntered(){
        String expected = "That is not a correct time format";
        String actual = parser.parseIt(standardInputIncorrect);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void parseItTestMilitaryCorrectTimeEntered(){
        String expected = "Zero Three Forty-Seven";
        String actual = parser.parseIt(militaryInputCorrect);
        assertEquals("We expect to get back the correct time",expected,actual);
    }

    @Test
    public void splitAtColonTestForHours(){
        String expected = "1";
        String actual = parser.splitAtColon("1:")[0];
        assertTrue(actual.equals(expected));
    }

    @Test
    public void splitAtColonTestForMinutes(){
        String expected = "47";
        String actual = parser.splitAtColon(":47")[1];
        assertTrue(expected.equals(actual));
    }

    @Test
    public void convertStandardHourTest(){
        String expected = "One";
        String actual = parser.convertStandardHour("1");
        assertTrue(expected.equals(actual));
    }

    @Test
    public void convertStandardMinuteTestAbove10(){
        String expected = "Forty-Seven";
        String actual = parser.convertStandardMinute("47");
        assertTrue(expected.equals(actual));
    }

    @Test
    public void convertStandardMinuteTestBelow10(){
        String expected = "O' Seven";
        String actual = parser.convertStandardMinute("07");
        assertTrue(expected.equals(actual));
    }

    @Test
    public void convertMilitaryHourTest(){
        String expected = "Zero Four";
        String actual = parser.convertMilitaryHour("04");
        assertTrue(expected.equals(actual));
    }

    @Test
    public void formatOutputTestMilitaryTimeOnTheHour(){
        String expected = "Zero Four Hundred";
        String actual = parser.formatOutput("04","00");
        assertTrue(expected.equals(actual));
    }

}
