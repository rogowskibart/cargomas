package com.example.cargomas.services;

import com.example.cargomas.api.v1.mapper.KomponentMapper;
import com.example.cargomas.api.v1.model.KomponentDTO;
import com.example.cargomas.api.v1.model.KomponentListDTO;
import com.example.cargomas.domain.Komponent;
import com.example.cargomas.domain.Rower;
import com.example.cargomas.repositories.KomponentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KomponentServiceImpl implements KomponentService {

    private final KomponentMapper komponentMapper;
    private final KomponentRepository komponentRepository;

    public KomponentServiceImpl(KomponentMapper komponentMapper, KomponentRepository komponentRepository) {
        this.komponentMapper = komponentMapper;
        this.komponentRepository = komponentRepository;
    }

    @Override
    public List<KomponentDTO> getAllKomponents() {
        return komponentRepository.findAll()
                .stream()
                .map(komponentMapper::komponentToKomponentDTO)
                .collect(Collectors.toList());
    }

    @Override
    public KomponentDTO getKomponentByKodProducenta(String kodProducenta) {
        return komponentMapper.komponentToKomponentDTO(komponentRepository.findByKodProducenta(kodProducenta));
    }

    @Override
    public List<KomponentDTO> getKomponentsByRowerId(Long id) {
        return komponentRepository.findByRowerId(id)
                .stream()
                .map(komponentMapper::komponentToKomponentDTO)
                .collect(Collectors.toList());
    }
}
