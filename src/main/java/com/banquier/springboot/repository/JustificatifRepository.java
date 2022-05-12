package com.banquier.springboot.repository;

import com.banquier.springboot.entity.Justificatif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JustificatifRepository  extends JpaRepository<Justificatif, Integer> {
    @Query("select u from Justificatif u where u.id = ?1")
    Optional<Justificatif> findbyID(int id);
}
