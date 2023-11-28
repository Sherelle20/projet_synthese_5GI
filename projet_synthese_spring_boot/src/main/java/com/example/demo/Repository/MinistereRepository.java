package com.example.demo.Repository;

import com.example.demo.Entities.Ministere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinistereRepository extends JpaRepository<Ministere, Integer> {
}
