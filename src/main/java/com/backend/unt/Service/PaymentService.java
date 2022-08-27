package com.backend.unt.Service;

import com.backend.unt.Entity.PaymentEntity;
import java.util.List;

public interface PaymentService {
    List<PaymentEntity> getPayments();
}
