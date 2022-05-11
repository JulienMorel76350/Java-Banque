package com.banquier.springboot.repository;

import com.banquier.springboot.entity.Banquier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanquierRepository  extends JpaRepository<Banquier, Integer> {

}
