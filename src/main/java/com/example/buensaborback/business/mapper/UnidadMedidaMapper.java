package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.UnidadMedidaDto.UnidadMedidaCreateDto;
import com.example.buensaborback.domain.dtos.UnidadMedidaDto.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.UnidadMedida;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnidadMedidaMapper extends BaseMapper<UnidadMedida, UnidadMedidaDto, UnidadMedidaCreateDto, UnidadMedidaCreateDto>{
    UnidadMedida toEntityCreate(UnidadMedidaCreateDto source);
}
