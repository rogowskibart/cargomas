package com.example.cargomas.api.v1.model;

import com.example.cargomas.domain.Rower;
import com.example.cargomas.domain.TypKomponentu;
import lombok.Data;

@Data
public class KomponentDTO {
    private Long id;
    private TypKomponentu typKomponentu;
    private String nazwa;
    private String producent;
    private String kodProducenta;
    private Rower rower;
}
