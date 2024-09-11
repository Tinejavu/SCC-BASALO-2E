
package basalo;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private final List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            product.displayProduct();
            System.out.println(); // empty line for separation
        }
    }
}