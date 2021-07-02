package com.example.cargomas.repositories;

import com.example.cargomas.domain.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresRepository extends JpaRepository<Adres, Long> {

    Adres findByUlica(String ulica);
}
