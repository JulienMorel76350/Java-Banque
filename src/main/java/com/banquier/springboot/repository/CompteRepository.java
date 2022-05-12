package com.banquier.springboot.repository;

import com.banquier.springboot.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompteRepository  extends JpaRepository<Compte, Integer> {
    @Query("select u from Compte u where u.id = ?1")
    Optional<Compte> findbyID(int id);
}