package ries.dan;

import java.util.Scanner;

/**
 * Created by danries on 2/15/17.
 */
public class IO {

    Scanner scanner = new Scanner(System.in);

    public String askForTime(){
        System.out.println("Please enter a time: ");
        return scanner.nextLine();
    }

    public void printTime(String time){
        System.out.println("The time is: " + time);
    }



}
