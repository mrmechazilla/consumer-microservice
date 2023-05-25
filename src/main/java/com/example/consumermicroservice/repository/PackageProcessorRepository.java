package com.example.consumermicroservice.repository;

import com.example.consumermicroservice.model.PackageProcessor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageProcessorRepository extends JpaRepository<PackageProcessor, Long> {
}
