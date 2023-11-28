package com.example.demo.Repository;

import com.example.demo.Entities.Gouverneur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GouverneurRepository extends JpaRepository<Gouverneur, Integer> {
}
