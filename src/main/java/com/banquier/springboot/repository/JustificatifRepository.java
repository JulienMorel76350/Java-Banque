package com.banquier.springboot.repository;

import com.banquier.springboot.entity.Justificatif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JustificatifRepository  extends JpaRepository<Justificatif, Integer> {

}
