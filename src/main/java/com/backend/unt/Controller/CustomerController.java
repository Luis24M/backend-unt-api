package com.backend.unt.Controller;

import com.backend.unt.Entity.CustomerEntity;
import com.backend.unt.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public List<CustomerEntity> listCustomers(){
        return customerService.listCustomers();
    }

    @PostMapping("")
    public CustomerEntity createCustomer(@RequestBody CustomerEntity customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/{id}")
    CustomerEntity updateCustomer(@RequestBody CustomerEntity customer, @PathVariable("id") int customerNumber) {
        return customerService.updateCustomer(customer, customerNumber);
    }

    @DeleteMapping("/{id}")
    void deleteCustomerByCustomerNumber(@PathVariable("id") int customerNumber) {
        customerService.deleteCustomerByCustomerNumber(customerNumber);
    }
}
