public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        // Add employees
        system.addEmployee(new Employee(101, "Alice", "Manager", 75000));
        system.addEmployee(new Employee(102, "Bob", "Developer", 55000));
        system.addEmployee(new Employee(103, "Charlie", "Tester", 45000));

        System.out.println("\n--- All Employees ---");
        system.displayAll();

        int searchId = 102;
        System.out.println("\n--- Searching for Employee with ID " + searchId + " ---");
        Employee found = system.searchEmployee(searchId);
        if (found != null) {
            System.out.println("Employee Found:");
            found.display();
        } else {
            System.out.println("Employee not found.");
        }

        int deleteId = 101;
        System.out.println("\n--- Deleting Employee with ID " + deleteId + " ---");
        system.deleteEmployee(deleteId);

        System.out.println("\n--- All Employees After Deletion ---");
        system.displayAll();
    }
}
