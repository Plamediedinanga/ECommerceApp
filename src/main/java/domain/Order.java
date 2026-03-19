package domain;

public class Order {
    private final String orderId;
    private final String customerId;
    private final String orderDate;
    private final double totalAmount;

    private Order (Builder builder) {
        this.orderId = builder.orderId;
        this.customerId = builder.customerId;
        this.orderDate = builder.orderDate;
        this.totalAmount = builder.totalAmount;
    }

    //Getters
    public String getOrderId() {
        return orderId;
    }
    public String getCustomerId() {
        return customerId;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public double getTotalAmount() {
        return totalAmount;
    }

    public static class Builder {
        private  String orderId;
        private  String customerId;
        private  String orderDate;
        private  double totalAmount;

        //Setters
        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }
        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }
        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }
        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
