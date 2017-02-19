package ries.dan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by danries on 2/15/17.
 */
public class Parser {

    ClockTimes clockTimes = new ClockTimes();

    Matcher hours;
    Matcher minutes;
    Matcher meridian;

    public String parseIt(String input){

        Pattern patternHours = Pattern.compile("(\\d+:)");
        Pattern patternMinutes = Pattern.compile("(:\\d+)");
        Pattern patternMeridian = Pattern.compile("(?i)am|pm");

        hours = patternHours.matcher(input);
        minutes = patternMinutes.matcher(input);
        meridian = patternMeridian.matcher(input);

        try {
            if (hours.find() && minutes.find() && meridian.find()) {
                return formatOutput(hours.group(),minutes.group(),meridian.group());
            }
            else if (hours.find() && minutes.find()){
                return formatOutput(hours.group(),minutes.group());
            }
        }catch (Exception e){
            System.out.println("That is not a correct time format " + e.getMessage());
        }
        return "That is not a correct time format";
    }

    public String formatOutput(String hour, String minute, String timeOfDay){
        hour = splitAtColon(hour)[0];
        minute = splitAtColon(minute)[1];
        timeOfDay = meridian.group();
        return convertStandardHour(hour) + " " + convertStandardMinute(minute) + " " + timeOfDay;
    }

    public String formatOutput(String hour, String minute){
        int minuteInNumber = Integer.parseInt(minute);
        if (minuteInNumber == 0){
            hour = splitAtColon(hour)[0];
            return convertMilitaryHour(hour) + " Hundred";
        }
        else{
            return hour + convertStandardMinute(minute);
        }
    }

    public String convertStandardHour(String hour){
        int hourTime = Integer.parseInt(hour);
        return clockTimes.getHours()[hourTime];
    }

    public String convertStandardMinute(String minute){
        int minuteTime = Integer.parseInt(minute);
        String letterTime = "";
        if (minuteTime < 10){
            letterTime = "O' " + clockTimes.getMinutes()[minuteTime];
        }
        else if (minuteTime > 20){
            String[] dual = minute.split("");
            String tens = dual[0];
            String single = dual[1];
            letterTime = clockTimes.getMinuteTens()[Integer.parseInt(tens)] + "-" + clockTimes.getMinutes()[Integer.parseInt(single)];
        }
        return letterTime;
    }

    public String convertMilitaryHour(String hour){
        int hourTime = Integer.parseInt(hour);
        return clockTimes.getMilitaryHours()[hourTime];
    }

    public String[] splitAtColon(String input){
        return input.split(":");
    }

}
