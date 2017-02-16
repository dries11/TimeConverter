package ries.dan;

/**
 * Created by danries on 2/15/17.
 */
public class Main{



    public static void main(String[] args) throws Exception{
        IO io = new IO();
        Parser parser = new Parser();

        io.printTime(parser.parseIt(io.askForTime()));
    }

}
