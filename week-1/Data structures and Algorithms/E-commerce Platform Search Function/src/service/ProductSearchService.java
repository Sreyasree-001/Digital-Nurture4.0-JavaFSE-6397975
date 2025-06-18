package service;

import algorithms.BinarySearch;
import algorithms.LinearSearch;
import model.Product;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSearchService {
    public Product searchLinear(Product[] products, String name) {
        return LinearSearch.linearSearch(products, name);
    }

    public Product searchBinary(Product[] products, String name) {
        Product[] sorted = Arrays.copyOf(products, products.length);
        Arrays.sort(sorted, Comparator.comparing(p -> p.getProductName().toLowerCase()));
        return BinarySearch.binarySearch(sorted, name);
    }
}
