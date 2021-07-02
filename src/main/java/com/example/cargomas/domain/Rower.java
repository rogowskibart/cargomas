package com.example.cargomas.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Rower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numerRoweru;

    private boolean czyElektryczny;

    private int cenaZaGodzine;

    private int udzwigSkrzyni;

    private int liczbaMiejscSiedzacyhWSkrzyni;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "rower_id")
    private List<Komponent> komponenty = new ArrayList<>();
}
