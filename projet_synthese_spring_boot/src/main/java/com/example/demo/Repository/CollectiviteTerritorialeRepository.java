package com.example.demo.Repository;

import com.example.demo.Entities.CollectiviteTerritoriale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectiviteTerritorialeRepository extends JpaRepository<CollectiviteTerritoriale, Integer> {
}
