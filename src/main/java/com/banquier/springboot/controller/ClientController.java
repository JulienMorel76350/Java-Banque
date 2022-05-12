package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Client;
import com.banquier.springboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "", produces="application/json")
    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    @PostMapping(value = "/", consumes = {"application/json"})
    public Client create(@RequestBody Client client) {
        clientRepository.save(client);
        return client;
    }
    @GetMapping("/{id}")
    public Client getId(@PathVariable(name = "id") int id) {
        return clientRepository.findbyID(id).get();
    }

    @PutMapping("/")
    public Client update(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Client> delete(@PathVariable(name = "id") int id) {
        clientRepository.deleteById(id);
        return ResponseEntity.ok().body(null);
    }
}
