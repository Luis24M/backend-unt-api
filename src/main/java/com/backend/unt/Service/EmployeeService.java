package com.backend.unt.Service;

import com.backend.unt.Entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getEmployees();
}
