package com.banquier.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.banquier.springboot.entity.User;
@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

    @Query("select u from User u where u.username = ?1")
    Optional<User> findUserWithName(String username);

    //@Query("select u from User u where u.username = ?1 and u.password = ?2")
    //Optional<User> findUserWithNameAndPassword(String username, String password);

    Optional<User> findByUsernameAndPassword(String username, String password);
}
