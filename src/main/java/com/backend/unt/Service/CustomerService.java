package com.backend.unt.Service;

import com.backend.unt.Entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    List<CustomerEntity> listCustomers();
    CustomerEntity createCustomer(CustomerEntity customer);
    CustomerEntity updateCustomer(CustomerEntity customer, int customerNumber);
    void deleteCustomerByCustomerNumber(int customerNumber);
}
