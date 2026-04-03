package com.example.demo.repository;

import com.example.demo.model.Energie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnergieRepository extends JpaRepository<Energie, Long> {
}
