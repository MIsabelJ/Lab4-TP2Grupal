package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoCreateDto;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoDto;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import org.mapstruct.Mapping;
//@Mapper(componentModel = "spring", uses = {PromocionService.class, ArticuloManufacturadoService.class})
public interface ArticuloInsumoMapper extends BaseMapper<ArticuloInsumo, ArticuloInsumoDto, ArticuloInsumoCreateDto, ArticuloInsumoDto> {
    //Habría que ver si se crea un metodo en los servicios que retorne un set basandose en un id
    @Mapping(target = "estaEnPromociones", source = "idEstaEnPromociones", qualifiedByName = "getById")
    @Mapping(target = "articuloManufacturados", source = "idArticuloManufacturados", qualifiedByName = "getById")
    ArticuloInsumo toEntityCreate (ArticuloInsumoCreateDto source);
}
