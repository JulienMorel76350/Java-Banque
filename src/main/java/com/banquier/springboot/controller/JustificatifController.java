package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Justificatif;
import com.banquier.springboot.repository.JustificatifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JustificatifController {
    @Autowired
    private JustificatifRepository justificatifRepository;

    @RequestMapping(value = "/justificatif", produces="application/json")
    public List<Justificatif> getAll(){
        return justificatifRepository.findAll();
    }
}
