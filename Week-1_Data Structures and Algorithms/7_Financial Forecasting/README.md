## Financial Forecasting Tool
A simple financial forecasting tool made in Java that uses recursive algorithm to predict future values based on past growth rates.
This project demonstrates how **recursion** can be applied to calculate projected financial values. 
The recursive approach simplifies the logic of compound growth over a number of years.

---

## Concept of Recursion

Recursion is a technique where a function calls itself untill a base case is reached. It solves a problem by breaking it down into smaller subproblems.  
It consists of:
- A **base case** – the condition under which the recursion stops.
- A **recursive case** – where the function calls itself with updated parameters.
  
It is used for:
- Simplifiing problems like tree traversal, factorial, Fibonacci series, etc.
- Ideal for problems with repetitive structure or subproblems.
---

##  Code Structure
    src/
      ├── FinancialPredictor.java   # Class containing the recursive method
      ├── Main.java                 # Main class
### Formula used
      FV = PV * (1 + r)^n
      Where:
      - FV = Future Value  
      - PV = Present Value (initial value)  
      - r = Annual Growth Rate  
      - n = Number of Years  
---

## Analysis
### Time Complexity
  - T(n) = T(n-1) + O(1) → Linear time O(n)
### Space Complexity
  - S(n) = O(n)
---

## Optimization Tips
  1. Use memoization to cache previously computed values.
  2. Use iterative methods for production-grade forecasting.
  3. Handle large numbers of years carefully to avoid stack overflow.
  
---

## Conclusion
- Recursion is suitable for small datasets or when modeling mathematical recurrences
- We can use iterative or memoized versions for large n to avoid stack overflow
