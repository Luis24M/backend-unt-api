package com.backend.unt.ServiceImpl;

import com.backend.unt.Entity.OrderDetailEntity;
import com.backend.unt.Entity.OrderEntity;
import com.backend.unt.Repository.OrderDetailRepository;
import com.backend.unt.Repository.OrderRepository;
import com.backend.unt.Service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetailEntity> getOrderDetails() {return orderDetailRepository.findAll();}
}
