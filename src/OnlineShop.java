import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    // private List<Product> products;
    private ShoppingCard shoppingCard;
    private List<Order> orders;

    /*public OnlineShop() {
        this.products = new ArrayList<>();
    }*/

    public void browseProducts() {
        if (shoppingCard != null) { // Si hay productos
            System.out.println("Available Products:");
            for (Product product : shoppingCard.getProducts()) {
                System.out.println(product.availableProductsInfoString());
            }
            System.out.println();
        }
    }

    public void addToCard(Product product1) {
        if (shoppingCard == null) {
            shoppingCard = new ShoppingCard();
        }

        shoppingCard.addToCard(product1);

        System.out.println("Product added to the card: " + shoppingCard.productAddedString());
    }

    public void removeFromCard(Product product) {
        shoppingCard.removeFromCard(product);
    }

    public void placeOrder() {
        if (!shoppingCard.areProductsEmpty()) {
            if (orders == null) {
                orders = new ArrayList<>();
            }

            List<Product> productList = new ArrayList<>(shoppingCard.getProducts());
            if (orders.isEmpty())
                orders.add(new Order(productList, "user", 1));
            else
                orders.add(new Order(productList, "user", orders.size() + 1));

            int currentOrder = orders.size() - 1;

            System.out.println("Order placed successfully!");
            System.out.println(orders.get(currentOrder).productIdOrderString() + orders.get(currentOrder).userOrderString());
            System.out.println("Products: ");
            for (Product p : orders.get(currentOrder).getProducts()) {
                System.out.println(p.productOrderString());
            }
            System.out.println(shoppingCard.calculateTotal());
        } else {
            System.out.println("There are no products in your shopping card.");
        }
    }

    private void showOrderHistory(List<Order> orders) {
        System.out.println("Order History: ");
        for (Order order : orders) {
            System.out.println(order.productIdOrderString() + order.userOrderString());
            System.out.println("Products: ");
            for (Product product : order.getProducts()) {
                System.out.println(product.productOrderString());
            }
            System.out.println(shoppingCard.calculateTotal()); // FIXME: pasarle la lista de productos y recalcularlo.
        }
    }

    public void displayOrderHistory() {
        showOrderHistory(orders);
    }
}
