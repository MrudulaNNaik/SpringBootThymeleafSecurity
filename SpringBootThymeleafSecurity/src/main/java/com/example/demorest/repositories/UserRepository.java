package com.example.demorest.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demorest.enitites.User;



public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}