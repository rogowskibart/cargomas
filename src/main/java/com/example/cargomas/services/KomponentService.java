package com.example.cargomas.services;

import com.example.cargomas.api.v1.model.KomponentDTO;
import com.example.cargomas.api.v1.model.KomponentListDTO;
import com.example.cargomas.domain.Komponent;
import com.example.cargomas.domain.Rower;

import java.util.List;

public interface KomponentService {

    List<KomponentDTO> getAllKomponents();

    KomponentDTO getKomponentByKodProducenta(String kodProducenta);

    List<KomponentDTO> getKomponentsByRowerId(Long id);
}
