package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.EmpresaDto.EmpresaCreateDto;
import com.example.buensaborback.domain.dtos.EmpresaDto.EmpresaDto;
import com.example.buensaborback.domain.entities.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring", uses = {SucursalMapper.class})
public interface EmpresaMapper extends BaseMapper<Empresa, EmpresaDto, EmpresaCreateDto, EmpresaCreateDto> {
    Empresa toEntityCreate(EmpresaCreateDto source);
}
