package com.backend.unt.ServiceImpl;

import com.backend.unt.Entity.EmployeeEntity;

import com.backend.unt.Entity.OrderEntity;
import com.backend.unt.Repository.EmployeeRepository;
import com.backend.unt.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> getEmployees(){return employeeRepository.findAll();}

}
