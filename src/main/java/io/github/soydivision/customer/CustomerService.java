package io.github.soydivision.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> allCustomersListDTO = new ArrayList<>();
        List<Customer> allCustomers = customerRepository.findAll();
        for (Customer customer : allCustomers) {
            allCustomersListDTO.add(new CustomerDTO(customer.getName()));
        }
        return allCustomersListDTO;
    }
}
