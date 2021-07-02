package com.example.cargomas.repositories;

import com.example.cargomas.domain.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {

    Region findByNazwa(String nazwa);
}
