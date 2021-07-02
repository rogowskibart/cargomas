package com.example.cargomas.repositories;

import com.example.cargomas.domain.Rower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RowerRepository extends JpaRepository<Rower, Long> {

    Rower findByNumerRoweru(int numer);
}
