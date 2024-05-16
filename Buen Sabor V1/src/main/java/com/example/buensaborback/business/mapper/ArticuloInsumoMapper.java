package com.example.buensaborback.business.mapper;

import com.example.buensaborback.business.service.PromocionService;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoCreateDto;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoDto;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PromocionService.class})
public interface ArticuloInsumoMapper extends BaseMapper<ArticuloInsumo, ArticuloInsumoDto, ArticuloInsumoCreateDto, ArticuloInsumoCreateDto> {
    //Habría que ver si se crea un metodo en los servicios que retorne un set basandose en un id
    @Mapping(target = "estaEnPromociones", source = "idEstaEnPromociones", qualifiedByName = "getById")
    ArticuloInsumo toEntityCreate (ArticuloInsumoCreateDto source);
}
