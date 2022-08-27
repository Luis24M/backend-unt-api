package com.backend.unt.ServiceImpl;

import com.backend.unt.Entity.PaymentEntity;
import com.backend.unt.Entity.ProductEntity;
import com.backend.unt.Repository.PaymentRepository;
import com.backend.unt.Repository.ProductRepository;
import com.backend.unt.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List <ProductEntity> getProducts() {
        return productRepository.findAll();
    }
}
