
package basalo;


public class Product {
    int id;
    String name;
    String category;
    int stockQuantity;
    double pricePerUnit;
    boolean isValid;

    public Product(int id, String name, String category, int stockQuantity, double pricePerUnit) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.pricePerUnit = pricePerUnit;
    }

    public void displayProductDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Price per Unit: " + pricePerUnit);
        System.out.println();
    }

    void displayProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

