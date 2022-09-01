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
    public List<CustomerEntity> listCustomers(){
        return customerRepository.findAll();
    }

    @Override
    public CustomerEntity createCustomer(CustomerEntity customer) {
        return customerRepository.save(customer);
    }

    @Override
    public CustomerEntity updateCustomer(CustomerEntity customer, int customerNumber) {
        CustomerEntity customerDB = customerRepository.findByCustomerNumber(customerNumber);

        customerDB.setCity(customer.getCity() == null ? customerDB.getCity() : customer.getCity());
        customerDB.setCustomerName(customer.getCustomerName() == null ? customerDB.getCustomerName() : customer.getCustomerName());

        return customerRepository.save(customerDB);
    }

    @Override
    public void deleteCustomerByCustomerNumber(int customerNumber) {
        customerRepository.deleteByCustomerNumber(customerNumber);
    }
}
