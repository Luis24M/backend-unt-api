package com.backend.unt.ServiceImpl;

import com.backend.unt.Entity.PaymentEntity;
import com.backend.unt.Entity.ProductLineEntity;
import com.backend.unt.Repository.ProductLineRepository;
import com.backend.unt.Repository.ProductRepository;
import com.backend.unt.Service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductLineServiceImpl implements ProductLineService {

    @Autowired
    private ProductLineRepository productLineRepository;

    @Override
    public List<ProductLineEntity> getProductLines() {
        return productLineRepository.findAll();
    }

}
