package com.example.buensaborback.business.mapper;

import com.example.buensaborback.business.service.ArticuloInsumoService;
import com.example.buensaborback.business.service.PromocionService;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoCreateDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring", uses = {PromocionService.class, ArticuloInsumoService.class})
public interface ArticuloManufacturadoMapper extends BaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto > {

    @Mapping(target = "articulosInsumos", source = "idArticulosInsumos", qualifiedByName = "getById")
    @Mapping(target = "estaEnPromociones", source = "idEstaEnPromociones", qualifiedByName = "getById")
    ArticuloManufacturado toEntityCreate(ArticuloManufacturadoCreateDto source);
}
