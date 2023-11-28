package com.example.demo.Repository;

import com.example.demo.Entities.Cadre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadreRepository extends JpaRepository<Cadre,Integer> {
}
