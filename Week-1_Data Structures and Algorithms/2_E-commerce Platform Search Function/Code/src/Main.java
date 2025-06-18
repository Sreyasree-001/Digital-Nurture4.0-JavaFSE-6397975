import controller.ProductController;
import model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shoes", "Footwear"),
                new Product(3, "Book", "Education"),
                new Product(4, "Mobile", "Electronics"),
                new Product(5, "Watch", "Accessories")
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the item: ");
        String productName = sc.nextLine();

        ProductController controller = new ProductController();
        controller.performSearch(products, productName);
    }
}
