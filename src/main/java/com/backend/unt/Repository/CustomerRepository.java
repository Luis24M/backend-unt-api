package com.backend.unt.Repository;

import com.backend.unt.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long>{
    List<CustomerEntity> findByCity(String city);
}
