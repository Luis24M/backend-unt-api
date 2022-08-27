package com.backend.unt.Service;

import com.backend.unt.Entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    List<CustomerEntity> getCustomers();
    List<CustomerEntity> getCustomersByCity(String city);
}
