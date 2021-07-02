package com.example.cargomas.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;

    @JsonBackReference
    @OneToMany(
            mappedBy = "region",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Serwis> serwisy = new HashSet<>();

    public void addSerwis(Serwis serwis) {
        serwisy.add(serwis);
        serwis.setRegion(this);
    }

    public void removeSerwis(Serwis serwis) {
        serwisy.remove(serwis);
        serwis.setRegion(null);
    }
}
