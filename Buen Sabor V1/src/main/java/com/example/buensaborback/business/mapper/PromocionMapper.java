package com.example.buensaborback.business.mapper;

import com.example.buensaborback.business.service.ArticuloInsumoService;
import com.example.buensaborback.business.service.ArticuloManufacturadoService;
import com.example.buensaborback.business.service.SucursalService;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionCreateDto;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionDto;
import com.example.buensaborback.domain.entities.Promocion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {SucursalService.class, ArticuloManufacturadoService.class, ArticuloInsumoService.class})
public interface PromocionMapper extends BaseMapper<Promocion, PromocionDto, PromocionCreateDto, PromocionCreateDto>{
    @Mapping(target = "sucursal", source = "idSucursal", qualifiedByName = "getById")
    @Mapping(target = "articuloManufacturados", source = "idArticuloManufacturados", qualifiedByName = "getById")
    @Mapping(target = "articulosInsumos", source = "idArticulosInsumos", qualifiedByName = "getById")
    Promocion toEntityCreate (PromocionCreateDto source);
}
