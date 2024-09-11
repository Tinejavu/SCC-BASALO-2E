
package basalo;

import java.util.Scanner;


public class BASALO {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Products: ");
        int numProducts = scanner.nextInt();

        Product[] products = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details of product " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Category: ");
            String category = scanner.next();

            System.out.print("Stock Quantity: ");
            int stockQuantity = scanner.nextInt();

            System.out.print("Price per Unit: ");
            double pricePerUnit = scanner.nextDouble();

            products[i] = new Product(id, name, category, stockQuantity, pricePerUnit);
        }

        System.out.println("ID\tName\tCategory\tStock Quantity\tPrice per Unit");
        for (Product product : products) {
            System.out.println(product.id + "\t" + product.name + "\t" + product.category + "\t" + product.stockQuantity + "\t" + product.pricePerUnit);
            System.out.println("Status\t" + (product.isValid ? "Valid" : "Invalid"));
        }
    }
}
   
    
