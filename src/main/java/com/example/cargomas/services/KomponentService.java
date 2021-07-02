package com.example.cargomas.services;

import com.example.cargomas.api.v1.model.KomponentDTO;
import com.example.cargomas.domain.Komponent;

import java.util.List;

public interface KomponentService {

    List<KomponentDTO> getAllKomponents();

    KomponentDTO getKomponentByKodProducenta(String kodProducenta);
}
