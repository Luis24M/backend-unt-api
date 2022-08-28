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
    public List<CustomerEntity> getCustomer(){
        return customerService.getCustomers();
    }

    @GetMapping("/{city}")
    public List<CustomerEntity> getCustomersByCity(@PathVariable("city") String city) {
        return customerService.getCustomersByCity(city);
    }
}
