package esad.chapter3.task12;

/**
 * @author grisha_angelov
 */
public class OtherAddress implements Address {
    private String otherAddress;

    public OtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    @Override
    public String getAddress() {
        return otherAddress;
    }
}
