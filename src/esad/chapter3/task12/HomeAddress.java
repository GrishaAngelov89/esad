package esad.chapter3.task12;

/**
 * @author grisha_angelov
 */
public class HomeAddress implements Address{
    private Customer customerPlacingOrder;

    @Override
    public String getAddress() {
        return customerPlacingOrder.getHomeAddress();
    }
}
