package com.backend.unt.ServiceImpl;

import com.backend.unt.Entity.CustomerEntity;
import com.backend.unt.Repository.CustomerRepository;
import com.backend.unt.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerEntity> getCustomers(){
        return customerRepository.findAll();
    }
}
