package com.sasha.farma.Controller;

import com.sasha.farma.DAO.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyRepository repository;

}
