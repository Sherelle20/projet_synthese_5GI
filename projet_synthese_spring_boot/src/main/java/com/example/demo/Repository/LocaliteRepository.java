package com.example.demo.Repository;

import com.example.demo.Entities.Localite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaliteRepository extends JpaRepository<Localite, Integer> {
}
