package com.banquier.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @GetMapping("/transaction")
	public String index() {
		return "transaction <3";
	}
}
