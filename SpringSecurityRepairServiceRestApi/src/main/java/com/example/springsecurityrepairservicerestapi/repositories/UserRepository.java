package com.example.springsecurityrepairservicerestapi.repositories;

import com.example.springsecurityrepairservicerestapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailEqualsIgnoreCase(String email);
}