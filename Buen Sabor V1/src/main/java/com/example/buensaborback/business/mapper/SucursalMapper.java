package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.SucursalDto.SucursalCreateDto;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.swing.*;

//@Mapper(componentModel = "spring", uses = {DomicilioMapper.class, EmpresaService.class, CategoriaService.class, PromocionesService.class})
public interface SucursalMapper extends BaseMapper<Sucursal, SucursalDto, SucursalCreateDto, SucursalCreateDto>{
    @Mapping(target = "empresa", source = "idEmpresa", qualifiedByName = "getById")
    @Mapping(target = "categorias", source = "idCategorias", qualifiedByName = "getById")
    @Mapping(target = "promociones", source = "idPromociones", qualifiedByName = "getById")
    Sucursal toEntityCreate(SucursalCreateDto source);
}
