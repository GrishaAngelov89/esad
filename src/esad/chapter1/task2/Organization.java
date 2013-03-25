package esad.chapter1.task2;

import java.util.Locale;

/**
 * @author: grisha_angelov
 */
public class Organization {
    private String id;
    private String englishName;
    private String chineseName;
    private Locale EAddress;
    private Locale CAddress;


    public String getId() {
        return id;
    }

    public String getEName() {
        return englishName;
    }

    public String getCName() {
        return chineseName;
    }

    public Locale getEAddress() {
        return EAddress;
    }

    public Locale getCAddress() {
        return CAddress;
    }
}
