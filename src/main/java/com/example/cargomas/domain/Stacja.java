package com.example.cargomas.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Stacja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String kod;

    @OneToOne(cascade = CascadeType.ALL)
    Adres adres;

    @Enumerated
    StatusStacji statusStacji;
}
