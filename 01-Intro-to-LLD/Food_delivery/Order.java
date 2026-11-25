public class Order {
    private static int orderCounter = 0;
    private int orderId;

    Order() {
        orderCounter++;
        this.orderId = orderCounter;
    }

    static int getTotalOrder() {
        return orderCounter;
    }

    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();

        System.out.println("Order 1 ID: " + order1.orderId);
        System.out.println("Order 2 ID: " + order2.orderId);
        System.out.println("Total Orders: " + Order.getTotalOrder());
    }
}
