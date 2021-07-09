package com.example.cargomas.repositories;

import com.example.cargomas.domain.Komponent;
import com.example.cargomas.domain.Rower;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KomponentRepository extends JpaRepository<Komponent, Long> {

    Komponent findByNazwa(String nazwa);

    Komponent findByKodProducenta(String kodProducenta);

    List<Komponent> findByRowerId(Long id);

}
