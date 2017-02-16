package ries.dan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by danries on 2/15/17.
 */
public class Parser {


    public String parseIt(String input){

        Pattern time = Pattern.compile("(?i)(\\d)(:)(\\d+)(\\w+)");
        Matcher matcher = time.matcher(input);

        String hour = matcher.group(2);
        String minute = matcher.group(4);
        String timeOfDay = matcher.group(5);

        for (HoursStandard hoursStandard : HoursStandard.values()){
            if (hour.equals(hoursStandard.getHour())){
                hour = hoursStandard.getHour();
            }
        }
        for (Minutes minutes : Minutes.values()){
            if (minute.equals(minutes.getMinutes())){
                minute = minutes.getMinutes();
            }
        }
        return hour + " " + minute + " " + timeOfDay;
    }



}
