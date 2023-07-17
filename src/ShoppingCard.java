import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private List<Product> products;

    public ShoppingCard() {
        this.products = new ArrayList<>();
    }

    public void addToCard(Product product) {
        products.add(product);
    }

    public void removeFromCard(Product product) {
        products.remove(product);
    }

    public String calculateTotal() {
        double sum = 0;
        for (Product p : products) {
            sum += p.getProductPrice();
        }
        return "Total: $" + sum + System.lineSeparator();
    }

    public boolean areProductsEmpty() {
        return products.isEmpty();
    }

    public List<Product> getProducts() {
        return products;
    }

    public String productAddedString() {
        return products.get(products.size() - 1).lastProductAddedToCard();
    }
}
