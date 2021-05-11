package com.example.demorest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demorest.enitites.Message;




public interface MessageRepository extends JpaRepository<Message, Integer>{

}