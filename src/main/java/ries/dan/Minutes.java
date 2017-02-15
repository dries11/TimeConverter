package ries.dan;

/**
 * Created by danries on 2/15/17.
 */
public enum Minutes {

    One("01"),
    Two("02"),
    Three("03"),
    Four("04"),
    Five("05"),
    Six("06"),
    Seven("07"),
    Eight("08"),
    Nine("09"),
    Ten("10"),
    Eleven("11"),
    Twelve("12"),
    Thirteen("13"),
    Fourteen("14"),
    Fifteen("15"),
    Sixteen("16"),
    Seventeen("17"),
    Eighteen("18"),
    Nineteen("19"),
    Twenty("20"),
    Thirty("3"),
    Fourty("4"),
    Fifty("5");

    private String minutes;

    Minutes(String minutes){
        this.minutes = minutes;
    }

    public String getMinutes(){
        return this.minutes;
    }

}
