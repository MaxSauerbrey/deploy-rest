package com.example.deployrest.repository;

import com.example.deployrest.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Persona,Long> {
}
