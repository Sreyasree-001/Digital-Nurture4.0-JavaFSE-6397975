import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();
        System.out.println("Instructions:- 1-Add New Product, 2-Update product details, 3-Delete product, 4-View all products, 5-exit");

        while(true){
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            if(ch==1){
                System.out.println("Enter details of new product:-");
                System.out.print("id:");
                long id = sc.nextLong();
                System.out.print("Name:");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Quantity:");
                int quantity = sc.nextInt();
                System.out.print("Price:");
                double price = sc.nextDouble();
                Product product = new Product(id,name,quantity,price);
                manager.addProduct(product);
                System.out.println("--------------------------------");
            }
            else if(ch==2){
                System.out.print("Enter id:");
                long id = sc.nextLong();
                System.out.print("Enter new quantity:");
                int quantity = sc.nextInt();
                System.out.print("Enter new price:");
                double price = sc.nextDouble();
                manager.updateProduct(id,quantity,price);
                System.out.println("--------------------------------");
            }
            else if(ch==3){
                System.out.print("Enter product id to remove:");
                long id = sc.nextLong();
                manager.deleteProduct(id);
                System.out.println("--------------------------------");
            }
            else if(ch==4){
                manager.displayAllProducts();
                System.out.println("--------------------------------");
            }
            else{
                System.out.print("Exiting..");
                break;
            }
        }


        sc.close();
    }
}
