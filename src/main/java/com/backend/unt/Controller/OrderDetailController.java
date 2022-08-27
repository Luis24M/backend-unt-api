package com.backend.unt.Controller;


import com.backend.unt.Entity.OrderDetailEntity;
import com.backend.unt.Service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderDetails")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping
    public List<OrderDetailEntity> getOrderDetail(){
        return orderDetailService.getOrderDetails();
    }
}
