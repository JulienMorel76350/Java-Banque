package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Compte;
import com.banquier.springboot.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompteController {
    @Autowired
    private CompteRepository compteRepository;

    @RequestMapping(value = "/compte", produces="application/json")
    public List<Compte> getAll(){
        return compteRepository.findAll();
    }
}