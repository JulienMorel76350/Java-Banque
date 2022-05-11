package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Client;
import com.banquier.springboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "/clients", produces="application/json")
    public List<Client> getAll(){
        return clientRepository.findAll();
    }

}
