package com.backend.unt.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payments")
@Entity
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentId")
    private int paymentId;

    @Column(name = "amount")
    private Float amount;

    @Column(name = "checkNumber")
    private String checkNumber;

    @Column(name = "paymentDate")
    private Date paymentDate;

    @ManyToOne
    @JoinColumn(name="customerNumber")
    @JsonIgnore
    private CustomerEntity customer;

}
