import controller.ProductController;
import model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter product "+(i+1));
            System.out.print("Enter id:");
            long id = sc.nextLong();
            System.out.print("Enter product name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter product category:");
            String category = sc.nextLine();
            products[i] = new Product(id,name,category);
        }

        System.out.print("Enter name of the item to search: ");
        String productName = sc.nextLine();

        ProductController controller = new ProductController();
        controller.performSearch(products, productName);

        sc.close();
    }
}
