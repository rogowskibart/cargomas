package com.example.cargomas.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Komponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypKomponentu typKomponentu;

    private String nazwa;

    private String producent;

    private String kodProducenta;
}
