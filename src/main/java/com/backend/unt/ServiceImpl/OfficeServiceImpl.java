package com.backend.unt.ServiceImpl;


import com.backend.unt.Entity.OfficeEntity;
import com.backend.unt.Repository.OfficeRepository;
import com.backend.unt.Service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeServiceImpl implements OfficeService {

    @Autowired
    private OfficeRepository officeRepository;

    @Override
    public List<OfficeEntity> getOffices() {
        return officeRepository.findAll();
    }
}