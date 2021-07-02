package com.example.cargomas.repositories;

import com.example.cargomas.domain.Komponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KomponentRepository extends JpaRepository<Komponent, Long> {

    Komponent findByNazwa(String nazwa);

    Komponent findByKodProducenta(String kodProducenta);
}
