package com.example.consumermicroservice.repository;

import com.example.consumermicroservice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
