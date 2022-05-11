package com.banquier.springboot.controller;

import com.banquier.springboot.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private ClientRepository clientRepository;

	@GetMapping("/")
	public String index() {
		clientRepository.findAll();
		return "moi content ;)";
	}

}