package esad.chapter1.task1;

public class Telephone {
    private String countryCode;
    private String areaCode;
    private String localNumber;

    public Telephone(String countryCode, String areaCode, String localNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.localNumber = localNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }
}