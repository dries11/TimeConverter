package ries.dan;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danries on 2/15/17.
 */
public class ParserTest {

    Parser parser = new Parser();

    String input = "12:03 pm";

    @Test
    public void parseItTest(){
        String expected = "Twelve OThree pm";
        String actual = parser.parseIt(input);
    }

}
