package com.banquier.springboot.repository;

import com.banquier.springboot.entity.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionRepository  extends JpaRepository<Transaction , Integer>{
    @Query("select u from Transaction u where u.id = ?1")
    Optional<Transaction> findbyID(int id);
}