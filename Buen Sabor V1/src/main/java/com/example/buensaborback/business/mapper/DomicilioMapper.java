package com.example.buensaborback.business.mapper;

import com.example.buensaborback.business.service.LocalidadService;
import com.example.buensaborback.domain.dtos.DomicilioDto.DomicilioCreateDto;
import com.example.buensaborback.domain.dtos.DomicilioDto.DomicilioDto;
import com.example.buensaborback.domain.entities.Domicilio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {LocalidadService.class})
public interface DomicilioMapper extends BaseMapper<Domicilio, DomicilioDto, DomicilioCreateDto, DomicilioCreateDto> {
    @Mapping(target = "localidad", source = "idLocalidad", qualifiedByName = "getById")
    Domicilio toEntityCreate(DomicilioCreateDto source);
}
