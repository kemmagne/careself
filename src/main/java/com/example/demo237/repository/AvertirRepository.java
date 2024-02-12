package com.example.demo237.repository;


import com.example.demo237.model.Avertir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvertirRepository extends JpaRepository<Avertir, Long> {
}
