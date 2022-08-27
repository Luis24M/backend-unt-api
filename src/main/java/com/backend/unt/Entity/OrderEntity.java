package com.backend.unt.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderNumber")
    private int orderNumber;

    @Column(name = "orderDate")
    private String orderDate;

    @Column(name = "requiredDate")
    private String requiredDate;

    @Column(name = "shippedDate")
    private String shippedDate;

    @Column(name = "status")
    private String status;

    @Column(name="comments")
    private String comments;

    @Column(name = "customerNumber")
    private Integer customerNumber;

}
