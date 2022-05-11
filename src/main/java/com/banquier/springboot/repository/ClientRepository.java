package com.banquier.springboot.repository;

import com.banquier.springboot.entity.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends JpaRepository<Client , Integer>{
    
}
