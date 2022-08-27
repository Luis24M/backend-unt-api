package com.backend.unt.Controller;

import com.backend.unt.Entity.ProductLineEntity;
import com.backend.unt.Service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productLines")
public class ProductLineController {

    @Autowired
    private ProductLineService productLineService;

    @GetMapping
    public List<ProductLineEntity> getProductLine(){
        return productLineService.getProductLines();
    }
}
