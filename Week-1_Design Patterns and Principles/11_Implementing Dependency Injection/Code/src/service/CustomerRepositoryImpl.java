package service;

import model.Customer;
import repository.CustomerRepository;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(long id) {
        // In a real application, this would interact with a database.
        // For simplicity, we'll return a dummy customer.
        return new Customer(id, "Sreyasree Sasmal", "sreyasree@gmail.com");
    }
}
