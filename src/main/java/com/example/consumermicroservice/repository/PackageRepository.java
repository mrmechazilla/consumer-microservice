package com.example.consumermicroservice.repository;

import com.example.consumermicroservice.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
}
