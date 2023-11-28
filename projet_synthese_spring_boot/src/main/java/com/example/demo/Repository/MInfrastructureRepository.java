package com.example.demo.Repository;

import com.example.demo.Entities.MInfrastructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MInfrastructureRepository extends JpaRepository<MInfrastructure, Integer> {
}
