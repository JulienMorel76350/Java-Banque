package com.banquier.springboot.repository;

import com.banquier.springboot.entity.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository  extends JpaRepository<Client , Integer>{

    @Query("select u from Client u where u.id = ?1")
    Optional<Client> findbyID(int id);
}
