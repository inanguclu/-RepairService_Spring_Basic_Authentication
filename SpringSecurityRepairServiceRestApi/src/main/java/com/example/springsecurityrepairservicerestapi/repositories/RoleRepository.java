package com.example.springsecurityrepairservicerestapi.repositories;

import com.example.springsecurityrepairservicerestapi.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}