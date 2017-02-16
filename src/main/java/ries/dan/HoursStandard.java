package ries.dan;

/**
 * Created by danries on 2/15/17.
 */
public enum HoursStandard {

    One("1"),
    Two("2"),
    Three("3"),
    Four("4"),
    Five("5"),
    Six("6"),
    Seven("7"),
    Eight("8"),
    Nine("9"),
    Ten("10"),
    Eleven("11"),
    Twelve("12");


    private String hour;

    HoursStandard(String val){this.hour = hour;}

    public String getHour(){return this.hour;}

    public void setHour(String hour) {
        this.hour = hour;
    }
}
