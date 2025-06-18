package algorithms;
import model.Product;

public class LinearSearch {
    public static Product linearSearch(Product[] products, String name){
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
