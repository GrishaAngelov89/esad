package esad.chapter3.task12;

import java.util.HashMap;

/**
 * @author grisha_angelov
 */
public class Order {
    String orderId;
    Restaurant restaurantReceivingOrder;
    HashMap orderItems;
    Address address;

    public String getDeliveryAddress() {
       return address.getAddress();
    }
}
