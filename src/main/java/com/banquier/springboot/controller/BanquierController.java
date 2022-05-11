package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Banquier;
import com.banquier.springboot.repository.BanquierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banquier")
public class BanquierController {
    @Autowired
    private BanquierRepository banquierRepository;

    @RequestMapping(value = "", produces="application/json")
    public List<Banquier> getAll(){
        return banquierRepository.findAll();
    }

    @GetMapping("/{id}")
    public Banquier getId(@PathVariable(name = "id") int id) {
        return banquierRepository.findbyID(id).get();
    }
}
