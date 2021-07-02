package com.example.cargomas.repositories;

import com.example.cargomas.domain.Serwis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerwisRepository extends JpaRepository<Serwis, Long> {

    Serwis findByNazwa(String nazwa);
}
