package com.backend.unt.Controller;

import com.backend.unt.Entity.CustomerEntity;
import com.backend.unt.Entity.ProductEntity;
import com.backend.unt.Service.CustomerService;
import com.backend.unt.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductEntity> getProduct(){
        return productService.getProducts();
    }
}
