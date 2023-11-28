package com.example.demo.Repository;

import com.example.demo.Entities.PossibiliteDeZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PossibiliteDeZoneRepository extends JpaRepository<PossibiliteDeZone, Integer> {
}
