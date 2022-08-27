package com.backend.unt.ServiceImpl;

import com.backend.unt.Entity.PaymentEntity;
import com.backend.unt.Repository.PaymentRepository;
import com.backend.unt.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<PaymentEntity> getPayments() {
        return paymentRepository.findAll();
    }
}

