package com.banquier.springboot.controller;

import com.banquier.springboot.entity.Justificatif;
import com.banquier.springboot.entity.Transaction;
import com.banquier.springboot.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
	@Autowired
	private TransactionRepository transactionRepository;

	@RequestMapping(value = "/transaction", produces="application/json")
	public List<Transaction> getAll(){
		return transactionRepository.findAll();
	}

	@PostMapping(value = "/", consumes = {"application/json"})
	public Transaction create(@RequestBody Transaction transaction) {
		transactionRepository.save(transaction);
		return transaction;
	}
	@GetMapping("/{id}")
	public Transaction getId(@PathVariable(name = "id") int id) {
		return transactionRepository.findbyID(id).get();
	}

	@PutMapping("/")
	public Transaction update(@RequestBody Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Transaction> delete(@PathVariable(name = "id") int id) {
		transactionRepository.deleteById(id);
		return ResponseEntity.ok().body(null);
	}
}
