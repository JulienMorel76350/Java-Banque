package com.banquier.springboot.repository;

import org.springframework.stereotype.Repository;

import com.banquier.springboot.entity.Transaction;

@Repository
public interface TransactionRepository{
	
	Transaction findByLastnameAndFirstname(String lastname, String firstname);
	
}