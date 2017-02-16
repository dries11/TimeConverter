package ries.dan;

/**
 * Created by danries on 2/15/17.
 */
public enum Minutes {

    OOne("01"),
    OTwo("02"),
    OThree("03"),
    OFour("04"),
    OFive("05"),
    OSix("06"),
    OSeven("07"),
    OEight("08"),
    ONine("09"),
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

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }
}
