package com.banquier.springboot.repository;

import com.banquier.springboot.entity.Banquier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BanquierRepository  extends JpaRepository<Banquier, Integer> {
    @Query("select u from Banquier u where u.id = ?1")
    Optional<Banquier> findbyID(int id);
}
