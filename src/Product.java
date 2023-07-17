public class Product {
    private int productId;
    private String productName;
    private double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String availableProductsInfoString() {
        return productId + ". " + productName + " - $" + productPrice;
    }

    public String lastProductAddedToCard() {
        return productName + " - $" + productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String productOrderString() {
        return "- " + productName + ": $" + productPrice;
    }
}
