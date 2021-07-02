package com.example.cargomas.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @JsonBackReference
    @OneToMany(
            mappedBy = "rower",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Komponent> komponenty = new HashSet<>();

    public void addKomponent(Komponent komponent) {
        komponenty.add(komponent);
        komponent.setRower(this);
    }

    public void removeKomponent(Komponent komponent) {
        komponenty.remove(komponent);
        komponent.setRower(null);
    }
}
