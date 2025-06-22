# E-commerce Platform Search Function

This project demonstrates efficient product search in an e-commerce platform using **Linear Search** and **Binary Search** algorithms. It is structured using a modular Java architecture following an MVC-like pattern.

---

## Project Structure

    src/
    ├── model/ # Product class (data structure)
    ├── algorithms/ # Search algorithm implementations
    ├── service/ # Business logic for product search
    ├── controller/ # Interface between main and services
    └── Main.java # Application entry point

---

## Big O Notation:

**Big O notation**  is an asymptotic notation to describe the performance or complexity of an algorithm in terms of:
1. Time (how fast it runs),
2. Space (how much memory it uses)
- It expresses the upper bound of an algorithm according to the input size.
- It is denoted as O(f(n)), where f(n) is a function that represents the number of operations that an algorithm performs to solve a problem of size n.
- Example: Linear Search has a complexity of O(1) in best case, O(n) in worst case.

        | Notation | Meaning                        | Example Use Case          |
        |----------|--------------------------------|---------------------------|
        | O(1)     | Constant time                  | HashMap access            |
        | O(log n) | Logarithmic time               | Binary Search             |
        | O(n)     | Linear time                    | Linear Search             |
        | O(n²)    | Quadratic time                 | Bubble Sort               |

---

## Search Operation Comparison
- Best case: The input provides the most favorable condition. In Linear Search the element is at the first index → O(1)
- Average case: The element is somewhere in the middle or appears randomly. In Linear Search the element is at a random index → O(n/2) = O(n)
- Worst case: The input causes the algorithm to do the most work. In Linear Search the element is at the last index or not present → O(n)


        | Algorithm         | Best Case            | Average Case  | Worst Case       | Time Complexity  |
        |-------------------|----------------------|---------------|------------------|------------------|
        | **Linear Search** | O(1) (1st match)     | O(n/2) → O(n) | O(n) (not found) | O(n)             |
        | **Binary Search** | O(1) (middle match)  | O(log n)      | O(log n)         | O(log n)         |

---

## Which one should we use?
### Use **Linear Search** when:
- The product list is small
- Data is unsorted or frequently changing
    
### Use **Binary Search** when:
- The product list is large
- The data is sorted or can be kept sorted

---

## Conclusion
- **Binary Search** is significantly faster than Linear Search for large sorted datasets.
- However, it requires the data to be sorted beforehand (O(n log n) if done dynamically).
- **Linear Search** is more flexible with unsorted or rapidly changing data but slower overall.
