package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Compte;
import com.banquier.springboot.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comptes")

public class CompteController {
    @Autowired
    private CompteRepository compteRepository;

    @RequestMapping(value = "", produces="application/json")
    public List<Compte> getAll(){
        return compteRepository.findAll();
    }

    @PostMapping(value = "/", consumes = {"application/json"})
    public Compte create(@RequestBody Compte compte) {
        compteRepository.save(compte);
        return compte;
    }
    @GetMapping("/{id}")
    public Compte getId(@PathVariable(name = "id") int id) {
        return compteRepository.findbyID(id).get();
    }

    @PutMapping("/")
    public Compte update(@RequestBody Compte compte) {
        return compteRepository.save(compte);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Compte> delete(@PathVariable(name = "id") int id) {
        compteRepository.deleteById(id);
        return ResponseEntity.ok().body(null);
    }


}