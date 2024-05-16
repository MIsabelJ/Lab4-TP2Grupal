package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.ImagenDto.ImagenCreateDto;
import com.example.buensaborback.domain.dtos.ImagenDto.ImagenDto;
import com.example.buensaborback.domain.entities.Imagen;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImagenMapper extends BaseMapper<Imagen, ImagenDto, ImagenCreateDto, ImagenCreateDto>{
}
