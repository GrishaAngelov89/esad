package esad.chapter2.task6;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author: grisha_angelov
 */
public class Order {
    final String DELIVER_HOME_ADDRESS = "H";
    final String DELIVER_WORK_ADDRESS = "W";
    final String DELIVER_OTHER_ADDRESS = "O";

    String orderId;
    Restaurant restaurant;
    Customer customer;
    String addressType;
    String otherAddress;
    HashMap orderItems;


    public double getTotalAmountOfOrder() {
        BigDecimal totalAmount = new BigDecimal("0.00");
        Iterator iterator = orderItems.values().iterator();
        while (iterator.hasNext()) {
            OrderItem nextOrderItem = (OrderItem) iterator.next();
            totalAmount = totalAmount.add(new BigDecimal(String.valueOf(nextOrderItem.getAmount())));
        }
        return totalAmount.doubleValue();
    }
}
