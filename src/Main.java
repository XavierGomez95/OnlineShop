
public class Main {
    public static void main (String[] args) {
        OnlineShop onlineShop = new OnlineShop();

        Product pixel = new Product(1, "Pixel", 2000);
        onlineShop.addToCard(pixel);

        Product acer = new Product(2, "Acer", 3000);
        onlineShop.addToCard(acer);

        Product camera = new Product(3, "Camara", 3000);
        onlineShop.addToCard(camera);

        // Browsing products
        onlineShop.browseProducts();

        // Adding products to the card
//        Product product1 = new Product(1, "iPhone", 999.99);
//        onlineShop.addToCard(product1);
//
//        Product product2 = new Product(2, "MacBook Pro", 1999.99);
        /*onlineShop.addToCard(pixel);
        onlineShop.addToCard(acer);
        onlineShop.addToCard(camera);*/



        // Removing product
        onlineShop.removeFromCard(camera);

        // Placing an order
        onlineShop.placeOrder();

        onlineShop.removeFromCard(pixel);
        onlineShop.removeFromCard(acer);


        onlineShop.addToCard(camera);

        onlineShop.placeOrder();

        // Display order history
        onlineShop.displayOrderHistory();
    }
}
