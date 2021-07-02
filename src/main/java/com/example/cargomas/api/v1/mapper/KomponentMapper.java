package com.example.cargomas.api.v1.mapper;

import com.example.cargomas.api.v1.model.KomponentDTO;
import com.example.cargomas.domain.Komponent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface KomponentMapper {

    KomponentMapper INSTANCE = Mappers.getMapper(KomponentMapper.class);

    @Mapping(source = "id", target = "id")
    KomponentDTO komponentToKomponentDTO(Komponent komponent);
}
