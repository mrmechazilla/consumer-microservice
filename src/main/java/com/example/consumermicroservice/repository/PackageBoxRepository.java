package com.example.consumermicroservice.repository;

import com.example.consumermicroservice.model.PackageBox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageBoxRepository extends JpaRepository<PackageBox, Long> {
}
