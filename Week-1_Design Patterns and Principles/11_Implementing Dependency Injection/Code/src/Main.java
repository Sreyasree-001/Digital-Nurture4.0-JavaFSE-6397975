import repository.CustomerRepository;
import service.CustomerRepositoryImpl;
import service.CustomerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer id: ");
        long id = sc.nextLong();

        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.getCustomerInfo(id);
    }
}
