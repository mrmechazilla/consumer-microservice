package com.example.consumermicroservice.repository;

import com.example.consumermicroservice.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
