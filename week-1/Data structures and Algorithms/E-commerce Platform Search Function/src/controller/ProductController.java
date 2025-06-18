package controller;

import model.Product;
import service.ProductSearchService;

public class ProductController {
    private ProductSearchService searchService;

    public ProductController() {
        this.searchService = new ProductSearchService();
    }

    public void performSearch(Product[] products, String searchTerm) {
        System.out.println("Using Linear Search:");
        Product result1 = searchService.searchLinear(products, searchTerm);
        System.out.println(result1 != null ? result1 : "Product not found.");

        System.out.println("Using Binary Search:");
        Product result2 = searchService.searchBinary(products, searchTerm);
        System.out.println(result2 != null ? result2 : "Product not found.");
    }
}
