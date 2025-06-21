public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 500.0),
                new Order(2, "Bob", 1200.0),
                new Order(3, "Charlie", 300.0)
        };


        BubbleSort.sort(orders);
        System.out.println("After Bubble Sort:");
        for (Order o : orders) System.out.println(o);

        // Resetting orders
        orders = new Order[] {
                new Order(1, "Alice", 500.0),
                new Order(2, "Bob", 1200.0),
                new Order(3, "Charlie", 300.0)
        };


        QuickSort.sort(orders, 0, orders.length - 1);
        System.out.println("\nAfter Quick Sort:");
        for (Order o : orders) System.out.println(o);
    }
}
