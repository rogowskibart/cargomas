package com.example.cargomas.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Komponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypKomponentu typKomponentu;

    private String nazwa;

    private String producent;

    private String kodProducenta;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Rower rower;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Komponent)) return false;
        return id != null && id.equals(((Komponent) o).getId());
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
