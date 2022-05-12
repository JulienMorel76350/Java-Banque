package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Compte;
import com.banquier.springboot.entity.Justificatif;
import com.banquier.springboot.repository.JustificatifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/justificatifs")
public class JustificatifController {
    @Autowired
    private JustificatifRepository justificatifRepository;

    @RequestMapping(value = "", produces="application/json")
    public List<Justificatif> getAll(){
        return justificatifRepository.findAll();
    }

    @PostMapping(value = "/", consumes = {"application/json"})
    public Justificatif create(@RequestBody Justificatif justificatif) {
        justificatifRepository.save(justificatif);
        return justificatif;
    }
    @GetMapping("/{id}")
    public Justificatif getId(@PathVariable(name = "id") int id) {
        return justificatifRepository.findbyID(id).get();
    }

    @PutMapping("/")
    public Justificatif update(@RequestBody Justificatif justificatif) {
        return justificatifRepository.save(justificatif);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Justificatif> delete(@PathVariable(name = "id") int id) {
        justificatifRepository.deleteById(id);
        return ResponseEntity.ok().body(null);
    }
}
