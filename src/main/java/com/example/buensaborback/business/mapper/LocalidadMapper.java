package com.example.buensaborback.business.mapper;

import com.example.buensaborback.business.service.ProvinciaService;
import com.example.buensaborback.domain.dtos.LocalidadDto.LocalidadCreateDto;
import com.example.buensaborback.domain.dtos.LocalidadDto.LocalidadDto;
import com.example.buensaborback.domain.entities.Localidad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProvinciaService.class})
public interface LocalidadMapper extends BaseMapper<Localidad, LocalidadDto, LocalidadCreateDto, LocalidadCreateDto>{
    @Mapping(target = "provincia", source = "idProvincia", qualifiedByName = "getById")
    Localidad toEntityCreate(LocalidadCreateDto source);
}
