package bd.edu.diu.cis.library.service;

import bd.edu.diu.cis.library.dto.CustomerDto;
import bd.edu.diu.cis.library.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> listAll();

    CustomerDto save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer saveInfor(Customer customer);

    double calculateDiscount(double amount);
}
