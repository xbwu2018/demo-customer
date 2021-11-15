package com.example.demo;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XIAOBING
 */
@RestController
@RequiredArgsConstructor

public class CustomersController {

	private CustomerRepository customerRepository;
	
	CustomersController(CustomerRepository repository) {
	    this.customerRepository = repository;
	  }

@PostMapping("/customers")
public void postCustomer(@RequestBody Customer customerDto) {
    Customer customer = new Customer();
    customer.setName(customerDto.getName());
    customer.setEmail(customerDto.getEmail());
    customerRepository.save(customer);
}

@PutMapping("/customers/{id}")
public void putCustomer(@PathVariable long id, @RequestBody Customer customerDto) {
    Customer customer = new Customer();
    customer.setId(id);
    customer.setName(customerDto.getName());
    customer.setEmail(customerDto.getEmail());
    customerRepository.save(customer);

}

@DeleteMapping("/customers/{id}")
public void deleteCustomer(@PathVariable long id) {

    customerRepository.deleteById(id);

}

@GetMapping("/customers/{id}")
public Customer getCustomer(@PathVariable long id) {

    return customerRepository
          .findById(id)
          .orElseThrow(CustomerNotFoundException::new);
}

@GetMapping("/customers")
public List<Customer> getCustomers() {

    return customerRepository.findAll();
}

}