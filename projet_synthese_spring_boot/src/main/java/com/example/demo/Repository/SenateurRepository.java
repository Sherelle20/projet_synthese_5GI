package com.example.demo.Repository;

import com.example.demo.Entities.Senateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenateurRepository extends JpaRepository<Senateur, Integer> {
}
