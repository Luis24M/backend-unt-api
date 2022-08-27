package com.backend.unt.ServiceImpl;

import com.backend.unt.Entity.OrderEntity;
import com.backend.unt.Repository.OrderRepository;
import com.backend.unt.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderEntity> getOrders() {return orderRepository.findAll();}

}
