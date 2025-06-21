import algorithms.BinarySearch;
import algorithms.LinearSearch;
import entity.Book;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = {
                new Book(1, "Java Basics", "John Smith"),
                new Book(2, "Python Fundamentals", "Alice Johnson"),
                new Book(3, "Data Structures", "Mark Davis"),
                new Book(4, "Algorithms in Java", "Brian Kernighan")
        };
        System.out.print("Enter book title:");
        String target = sc.nextLine();

        Book linearResult = LinearSearch.searchByTitle(books, target);
        System.out.println("Linear Search: " +
                (linearResult != null ? linearResult : "Book not found"));

        Book binaryResult = BinarySearch.searchByTitle(books, target);
        System.out.println("Binary Search: " +
                (binaryResult != null ? binaryResult : "Book not found"));
    }
}
