package com.example.cargomas.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class KomponentListDTO {
    private List<KomponentDTO> komponentDTOS;
}
