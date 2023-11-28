package com.example.demo.Repository;

import com.example.demo.Entities.RessourcesZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourcesZoneRepository extends JpaRepository<RessourcesZone, Integer> {
}
