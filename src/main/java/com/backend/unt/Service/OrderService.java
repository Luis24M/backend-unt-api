package com.backend.unt.Service;

import com.backend.unt.Entity.OrderEntity;
import java.util.List;

public interface OrderService {
    List<OrderEntity> getOrders();
}
