package model;

public class Product {
    public long productId;
    public String productName;
    public String category;

    public Product(long id,String name,String category){
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "ProductID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}
