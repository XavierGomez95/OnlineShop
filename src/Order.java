import java.util.List;

public class Order {
    private int order;
    private String user;
    private List<Product> products;

    public Order(List<Product> products, String user, int order) {
        this.products = products;
        this.order = order;
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String userOrderString() {
        return "User: [" + user + "]";
    }

    public String productIdOrderString() {
        return "Order ID: " + order + System.lineSeparator();
    }
}
