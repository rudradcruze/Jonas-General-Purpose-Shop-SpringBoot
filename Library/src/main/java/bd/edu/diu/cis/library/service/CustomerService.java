package bd.edu.diu.cis.library.service;

import bd.edu.diu.cis.library.dto.CustomerDto;
import bd.edu.diu.cis.library.model.Customer;

public interface CustomerService {

    CustomerDto save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer saveInfor(Customer customer);
}
