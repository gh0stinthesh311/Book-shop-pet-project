package io.github.gh0stinthesh311.customer;

import jakarta.persistence.EntityNotFoundException;
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

    public CustomerDTO getCustomerById(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No such data"));
        return new CustomerDTO(customer.getName());
    }
}
