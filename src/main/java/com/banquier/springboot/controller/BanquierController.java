package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Banquier;
import com.banquier.springboot.repository.BanquierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BanquierController {
    @Autowired
    private BanquierRepository banquierRepository;

    @RequestMapping(value = "/banquier", produces="application/json")
    public List<Banquier> getAll(){
        return banquierRepository.findAll();
    }
}
