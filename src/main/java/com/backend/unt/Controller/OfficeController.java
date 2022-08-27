package com.backend.unt.Controller;

import com.backend.unt.Entity.OfficeEntity;
import com.backend.unt.Service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("offices")
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    @GetMapping
    public List<OfficeEntity> getOffice(){
        return officeService.getOffices();
    }
}
