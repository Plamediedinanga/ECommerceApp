package factory;

import domain.Order;

public class OrderFactory {
    public static Order createOrder(String orderId, String customerId, String orderDate, double totalAmount) {
        return new Order.Builder()
                .setOrderId(orderId)
                .setCustomerId(customerId)
                .setOrderDate(orderDate)
                .setTotalAmount(totalAmount)
                .build();
    }
}
