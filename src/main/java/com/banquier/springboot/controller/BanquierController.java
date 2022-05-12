package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Banquier;
import com.banquier.springboot.repository.BanquierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banquiers")
public class BanquierController {
    @Autowired
    private BanquierRepository banquierRepository;

    @RequestMapping(value = "", produces="application/json")
    public List<Banquier> getAll(){
        return banquierRepository.findAll();
    }

    @PostMapping(value = "/", consumes = {"application/json"})
    public Banquier create(@RequestBody Banquier banquier) {
        banquierRepository.save(banquier);
        return banquier;
    }

    @GetMapping("/{id}")
    public Banquier getId(@PathVariable(name = "id") int id) {
        return banquierRepository.findbyID(id).get();
    }

    @PutMapping("/")
    public Banquier update(@RequestBody Banquier banquier) {
        return banquierRepository.save(banquier);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Banquier> delete(@PathVariable(name = "id") int id) {
        banquierRepository.deleteById(id);
        return ResponseEntity.ok().body(null);
    }
}
