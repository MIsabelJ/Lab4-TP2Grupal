package com.example.buensaborback.business.mapper;

import com.example.buensaborback.business.service.PaisService;
import com.example.buensaborback.domain.dtos.ProvinciaDto.ProvinciaCreateDto;
import com.example.buensaborback.domain.dtos.ProvinciaDto.ProvinciaDto;
import com.example.buensaborback.domain.entities.Provincia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring", uses = {PaisService.class})
public interface ProvinciaMapper extends BaseMapper<Provincia, ProvinciaDto, ProvinciaCreateDto, ProvinciaCreateDto>{
    @Mapping(target = "pais", source = "idPais", qualifiedByName = "getById")
    Provincia toEntityCreate(ProvinciaCreateDto source);
}
