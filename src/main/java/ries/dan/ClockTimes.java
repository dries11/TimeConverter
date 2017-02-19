package ries.dan;

/**
 * Created by danries on 2/15/17.
 */
public class ClockTimes {

    private String[] hours = new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve"};

    private String[] militaryHours = new String[]{"Zero","Zero One","Zero Two","Zero Three","Zero Four","Zero Five","Zero Six","Zero Seven","Zero Eight","Zero Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Twenty One","Twenty Two","Twenty Three"};

    private String[] minutes = new String[]{"O'clock","One", "Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eigthteen","Nineteen"};

    private String[] minuteTens = new String[]{"Zero","Ten","Twenty","Thirty","Forty","Fifty"};

    public String[] getHours(){
        return hours;
    }

    public String[] getMinutes(){
        return minutes;
    }

    public String[] getMinuteTens(){
        return minuteTens;
    }

    public String[] getMilitaryHours() {
        return militaryHours;
    }
}
