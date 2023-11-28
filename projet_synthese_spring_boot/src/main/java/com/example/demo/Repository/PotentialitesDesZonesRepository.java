package com.example.demo.Repository;

import com.example.demo.Entities.PotentialitesDesZones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotentialitesDesZonesRepository extends JpaRepository<PotentialitesDesZones, Integer> {
}
