package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Transaction;
import com.banquier.springboot.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {
	@Autowired
	private TransactionRepository transactionRepository;

	@RequestMapping(value = "/transaction", produces="application/json")
	public List<Transaction> getAll(){
		return transactionRepository.findAll();
	}
}
