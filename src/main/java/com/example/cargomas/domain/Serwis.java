package com.example.cargomas.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Serwis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Region region;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serwis)) return false;
        return id != null && id.equals(((Serwis) o).getId());
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
