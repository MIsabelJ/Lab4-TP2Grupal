package com.example.buensaborback.business.mapper;

import com.example.buensaborback.business.service.EmpresaService;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalCreateDto;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.swing.*;

@Mapper(componentModel = "spring", uses = {DomicilioMapper.class, EmpresaService.class})
public interface SucursalMapper extends BaseMapper<Sucursal, SucursalDto, SucursalCreateDto, SucursalCreateDto>{
    @Mapping(target = "empresa", source = "idEmpresa", qualifiedByName = "getById")
    Sucursal toEntityCreate(SucursalCreateDto source);
}
