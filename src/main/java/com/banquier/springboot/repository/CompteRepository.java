package com.banquier.springboot.repository;

import com.banquier.springboot.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository  extends JpaRepository<Compte, Integer> {

}